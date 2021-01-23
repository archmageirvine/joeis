package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a046.A046937;

/**
 * A038561 Left-hand border of triangle A046937.
 * @author Sean A. Irvine
 */
public class A038561 extends A046937 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, 0L);
  }
}
