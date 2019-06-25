package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024208.
 * @author Sean A. Irvine
 */
public class A024208 extends A024207 {

  @Override
  public Z next() {
    return get(++mN, 8L);
  }
}
