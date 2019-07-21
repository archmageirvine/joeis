package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024704.
 * @author Sean A. Irvine
 */
public class A024704 extends A024702 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().isEven()) {
        return Z.valueOf(mN);
      }
    }
  }
}
