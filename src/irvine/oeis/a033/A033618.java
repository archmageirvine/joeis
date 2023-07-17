package irvine.oeis.a033;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a010.A010785;

/**
 * A033618 Number of ways n-th repdigit number, A010785(n), can be expressed as a polygonal number.
 * @author Sean A. Irvine
 */
public class A033618 extends A010785 {

  /** Construct the sequence. */
  public A033618() {
    super(2);
  }

  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    final Z r = super.next();
    if (Z.TWO.equals(r)) {
      return Z.TWO; // Not sure why this special case needed
    }
    final Z t = r.multiply2();
    long c = 0;
    for (final Z n : Jaguar.factor(t).divisors()) {
      if (!Z.ONE.equals(n)) {
        final Z q = t.divide(n);
        final Z n1 = n.subtract(1);
        if (q.mod(n1).equals(Z.TWO.mod(n1))) {
          ++c;
        }
      }
    }
    return Z.valueOf(c);
  }
}
