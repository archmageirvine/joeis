package irvine.oeis.a033;

import irvine.math.z.Z;

/**
 * A033872 Numbers k such that A033831(k) is prime.
 * @author Sean A. Irvine
 */
public class A033872 extends A033831 {

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
