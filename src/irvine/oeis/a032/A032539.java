package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A032539 Integer part of decimal 'base-4 looking' numbers divided by their actual base-4 values.
 * @author Sean A. Irvine
 */
public class A032539 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return new Z(Long.toString(++mN, 4)).divide(mN);
  }
}
