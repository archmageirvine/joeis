package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030609 Position of n-th 4 in A030604.
 * @author Sean A. Irvine
 */
public class A030609 extends A030604 {

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
      if (Z.FOUR.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

