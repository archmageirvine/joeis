package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence3;
import irvine.oeis.a000.A000040;

/**
 * A078611 Radius of the shortest interval (of positive length) centered at prime(n) that has prime endpoints.
 * @author Sean A. Irvine
 */
public class A078611 extends Sequence3 {

  private final Sequence mPrimes = new A000040().skip(2);

  @Override
  public Z next() {
    final Z p = mPrimes.next();
    Z q = p;
    while (true) {
      q = Functions.PREV_PRIME.z(q);
      final Z d = p.subtract(q);
      if (p.add(d).isProbablePrime()) {
        return d;
      }
    }
  }
}

