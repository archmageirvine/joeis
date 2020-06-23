package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032542 Integer part of decimal <code>'base-5</code> looking' numbers divided by their actual <code>base-5</code> values.
 * @author Sean A. Irvine
 */
public class A032542 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return new Z(Long.toString(++mN, 5)).divide(mN);
  }
}
