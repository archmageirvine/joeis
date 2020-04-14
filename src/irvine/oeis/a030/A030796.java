package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030796 Numbers k such that <code>A030787(k)=4</code>.
 * @author Sean A. Irvine
 */
public class A030796 extends A030787 {

  private long mN = 0;

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

