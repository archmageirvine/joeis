package irvine.oeis.a018;

import irvine.math.z.Z;

/**
 * A018220.
 * @author Sean A. Irvine
 */
public class A018220 extends A018219 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(get(++mN, 1L));
  }
}

