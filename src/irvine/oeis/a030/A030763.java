package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030763 s(n)=1, where s=A030757.
 * @author Sean A. Irvine
 */
public class A030763 extends A030757 {

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

