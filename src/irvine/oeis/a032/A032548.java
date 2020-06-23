package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032548 Integer part of decimal <code>'base-7</code> looking' numbers divided by their actual <code>base-7</code> values.
 * @author Sean A. Irvine
 */
public class A032548 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return new Z(Long.toString(++mN, 7)).divide(mN);
  }
}
