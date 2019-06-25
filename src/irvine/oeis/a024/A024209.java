package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024209.
 * @author Sean A. Irvine
 */
public class A024209 extends A024207 {

  @Override
  public Z next() {
    return get(++mN, 9L);
  }
}
