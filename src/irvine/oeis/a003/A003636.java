package irvine.oeis.a003;

import java.util.ArrayList;
import java.util.List;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A003636 Number of classes per genus in quadratic field with discriminant -n.
 * @author Sean A. Irvine
 */
public class A003636 extends Sequence3 {

  // Based on Pari code by Rick L. Shepherd

  /**
   * Represent a reduced positive definite form.
   */
  public static class ReducedPositiveDefiniteForm {
    private final long mA;
    private final long mB;
    private final long mC;

    ReducedPositiveDefiniteForm(final long a, final long b, final long c) {
      mA = a;
      mB = b;
      mC = c;
    }

    boolean isPrimitive() {
      return Math.abs(LongUtils.gcd(mA, mB, mC)) == 1;
    }

    @Override
    public String toString() {
      return "(" + mA + "," + mB + "," + mC + ")" + (isPrimitive() ? "" : "*");
    }
  }

  /**
   * Return a list of the reduced positive definite forms for a negative discriminant
   * @param d discriminant
   * @return reduced positive definite forms
   */
  public static List<ReducedPositiveDefiniteForm> forms(final long d) {
    if (d >= 0) {
      throw new IllegalArgumentException("Discriminant must be negative");
    }
    if ((d & 3) > 1) {
      throw new IllegalArgumentException("Discriminant must be congruent to 0 or 1 (mod 4)");
    }
    final ArrayList<ReducedPositiveDefiniteForm> forms = new ArrayList<>();
    final long bigD = -d;
    final long bMax = (long) Math.sqrt(bigD / 3.0);
    final long bStart = (bigD & 3) == 0 ? 0 : 1;
    for (long b = bStart; b <= bMax; b += 2) {
      final long ac = (bigD + b * b) / 4;
      for (final Z dd : Jaguar.factor(ac).divisors()) {
        final long a = dd.longValueExact();
        final long c = ac / a;
        if ((c > a && b <= a) || c == a) {
          forms.add(new ReducedPositiveDefiniteForm(a, b, c));
          if (b > 0 && b < a && a < c) {
            forms.add(new ReducedPositiveDefiniteForm(a, -b, c));
          }
        }
      }
    }
    return forms;
  }

  static long genera(final long d) {
    final long r = Functions.OMEGA.i(Math.abs(d));
    if (r > 64) {
      throw new UnsupportedOperationException();
    }
    return 1L << (r - 1);
  }

  /**
   * The class number of a form.
   * @param forms the form
   * @return the class number
   */
  public static long classNumber(final List<ReducedPositiveDefiniteForm> forms) {
    long c = 0;
    for (final ReducedPositiveDefiniteForm f : forms) {
      if (f.isPrimitive()) {
        ++c;
      }
    }
    return c;
  }

  long mN = -2;

  @Override
  public Z next() {
    while (true) {
      --mN;
      if ((mN & 3) <= 1) {
        final List<ReducedPositiveDefiniteForm> forms = forms(mN);
        final long classNumber = classNumber(forms);
        if (classNumber == forms.size()) {
          //System.out.println(mN + " " + classNumber / genera(mN) + " " + forms.size());
          return Z.valueOf(classNumber / genera(mN));
        }
      }
    }
  }
}
