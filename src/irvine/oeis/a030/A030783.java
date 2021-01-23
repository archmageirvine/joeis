package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030783 s(k)=1, where s=A030777.
 * @author Sean A. Irvine
 */
public class A030783 extends A030777 {

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

