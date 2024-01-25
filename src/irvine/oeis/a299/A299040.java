package irvine.oeis.a299;

import irvine.math.z.Z;
import irvine.oeis.a068.A068072;

/**
 * A068072.
 * @author Sean A. Irvine
 */
public class A299040 extends A068072 {

  @Override
  public Z next() {
    super.next();
    return Z.valueOf(mLast);
  }
}
