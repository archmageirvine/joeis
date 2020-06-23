package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032536 Integer part of decimal <code>'base-3</code> looking' numbers divided by their actual <code>base-3</code> values.
 * @author Sean A. Irvine
 */
public class A032536 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return new Z(Long.toString(++mN, 3)).divide(mN);
  }
}
