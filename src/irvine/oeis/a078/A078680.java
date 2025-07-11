package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078680 Smallest m &gt; 0 such that n*2^m + 1 is prime, or 0 if no such m exists.
 * @author Sean A. Irvine
 */
public class A078680 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z t = Z.valueOf(++mN);
    long m = 0;
    while (true) {
      ++m;
      t = t.multiply2();
      if (t.add(1).isProbablePrime()) {
        return Z.valueOf(m);
      }
    }
  }
}

