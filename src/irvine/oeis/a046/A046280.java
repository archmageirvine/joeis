package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046280 Numbers k such that the sum of the first k lucky numbers, A046279(k), is prime.
 * @author Sean A. Irvine
 */
public class A046280 extends A046279 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
