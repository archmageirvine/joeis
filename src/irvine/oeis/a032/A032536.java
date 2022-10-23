package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A032536 Integer part of decimal 'base-3 looking' numbers divided by their actual base-3 values.
 * @author Sean A. Irvine
 */
public class A032536 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return new Z(Long.toString(++mN, 3)).divide(mN);
  }
}
