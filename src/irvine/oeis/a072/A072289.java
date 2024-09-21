package irvine.oeis.a072;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a008.A008846;

/**
 * A072289 One eighty-fourth the area of primitive Pythagorean triangles with (increasing) square hypotenuses (precisely those of A008846).
 * @author Sean A. Irvine
 */
public class A072289 extends A008846 {

  private final TreeSet<Z> mA = new TreeSet<>();

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      final long c = super.next().longValueExact();
      for (long b = 1; b < c; ++b) {
        if (Functions.GCD.l(c, b) == 1) {
          final long a2 = c * c - b * b;
          final long a = Functions.SQRT.l(a2);
          if (a < b && a * a == a2 && Functions.GCD.l(a, c) == 1 && Functions.GCD.l(a, b) == 1) {
            mA.add(Z.valueOf(a).multiply(b).multiply(b * b - a * a).divide(84));
          }
        }
      }
    }
    return mA.pollFirst();
  }
}
