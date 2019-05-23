package irvine.oeis.a022;

import irvine.math.z.Z;

/**
 * A022898.
 * @author Sean A. Irvine
 */
public class A022898 extends A022897 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(2L, ++mN);
  }
}
