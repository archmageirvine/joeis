package irvine.oeis.a107;

import irvine.math.z.Z;
import irvine.oeis.a007.A007191;

/**
 * A107080.
 * @author Sean A. Irvine
 */
public class A107080 extends A007191 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z a = super.next();
    return ++mN == 1 ? Z.ZERO : a.abs();
  }
}

