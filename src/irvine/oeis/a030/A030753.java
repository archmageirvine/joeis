package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030753 s(k)=1, where s=A030747.
 * @author Sean A. Irvine
 */
public class A030753 extends A030747 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.ONE.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

