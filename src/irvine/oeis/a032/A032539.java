package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032539 Integer part of decimal <code>'base-4</code> looking' numbers divided by their actual <code>base-4</code> values.
 * @author Sean A. Irvine
 */
public class A032539 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return new Z(Long.toString(++mN, 4)).divide(mN);
  }
}
