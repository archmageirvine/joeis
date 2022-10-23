package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A048787 Write n in base 3 then rotate left one place.
 * @author Sean A. Irvine
 */
public class A048787 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final String s = Long.toString(++mN, 3);
    return new Z(s.substring(1) + s.charAt(0), 3);
  }
}
