package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.a007.A007241;

/**
 * A045478.
 * @author Sean A. Irvine
 */
public class A045478 extends A007241 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z a = super.next();
    return ++mN == 1 ? Z.EIGHT : a;
  }
}

