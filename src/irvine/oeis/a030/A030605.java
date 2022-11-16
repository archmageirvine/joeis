package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030605 Position of n-th 0 in A030604 (previous version).
 * @author Sean A. Irvine
 */
public class A030605 extends A030604 {

  private long mN = 0;
  {
    setOffset(1);
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}

