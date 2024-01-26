package irvine.oeis.a299;

import irvine.math.z.Z;
import irvine.oeis.a068.A068072;

/**
 * A299040 Number of digits in the base-n representation of the last base-n narcissistic number.
 * @author Sean A. Irvine
 */
public class A299040 extends A068072 {

  @Override
  public Z next() {
    super.next();
    return Z.valueOf(mLast);
  }
}
