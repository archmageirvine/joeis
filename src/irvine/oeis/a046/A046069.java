package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046069 Smallest m &gt;= 0 such that (2n-1)2^m-1 is prime, or -1 if no such value exists.
 * @author Sean A. Irvine
 */
public class A046069 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    Z n = Z.valueOf(mN);
    long m = 0;
    while (!n.subtract(1).isProbablePrime()) {
      n = n.multiply2();
      ++m;
    }
    return Z.valueOf(m);
  }
}
