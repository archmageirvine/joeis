package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032545 Integer part of decimal 'base-6 looking' numbers divided by their actual base-6 values, rounded down.
 * @author Sean A. Irvine
 */
public class A032545 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return new Z(Long.toString(++mN, 6)).divide(mN);
  }
}
