package irvine.oeis.a007;

import irvine.math.z.Z;

/**
 * A007267.
 * @author Sean A. Irvine
 */
public class A007267 extends A007241 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z a = super.next();
    return ++mN == 1 ? Z.valueOf(104) : a;
  }
}

