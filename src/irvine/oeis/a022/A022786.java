package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.a023.A023124;

/**
 * A022786.
 * @author Sean A. Irvine
 */
public class A022786 extends A023124 {

  private long mN = 0;

  @Override
  public Z next() {
    while (!Z.ONE.equals(super.next())) {
      ++mN;
    }
    return Z.valueOf(++mN);
  }
}
