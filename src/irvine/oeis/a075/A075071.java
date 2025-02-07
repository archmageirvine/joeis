package irvine.oeis.a075;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075071 n! divided by product of factorials of all proper divisors of n, as n runs through the values for which the result is an integer.
 * @author Sean A. Irvine
 */
public class A075071 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    Z f = Functions.FACTORIAL.z(++mN);
    for (final Z d : Jaguar.factor(mN).divisors()) {
      if (!d.equals(mN)) {
        final Z[] qr = f.divideAndRemainder(Functions.FACTORIAL.z(d));
        if (qr[1].isZero()) {
          f = qr[0];
        }
      }
    }
    return f;
  }
}

