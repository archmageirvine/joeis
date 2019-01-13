package irvine.oeis.a000;

import java.io.Serializable;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000129.
 * @author Sean A. Irvine
 */
public class A000129 implements Sequence, Serializable {

  private Z mA = Z.TWO.negate();
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    final Z r = mB.multiply2().add(mA);
    mA = mB;
    mB = r;
    return r;
  }
}
