package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A073697 Group the even numbers so that the product of the terms in each group + 1 is a prime: (2), (4), (6), (8, 10, 12, 14), (16), (18), ... Sequence gives number of terms in each group.
 * @author Sean A. Irvine
 */
public class A073697 extends Sequence0 {

  private long mN = 0;

  @Override
  public Z next() {
    mN += 2;
    long cnt = 1;
    Z prod = Z.valueOf(mN);
    while (!prod.add(1).isProbablePrime()) {
      mN += 2;
      prod = prod.multiply(mN);
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
