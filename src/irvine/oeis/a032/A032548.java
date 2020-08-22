package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032548 Integer part of decimal 'base-7 looking' numbers divided by their actual base-7 values.
 * @author Sean A. Irvine
 */
public class A032548 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return new Z(Long.toString(++mN, 7)).divide(mN);
  }
}
