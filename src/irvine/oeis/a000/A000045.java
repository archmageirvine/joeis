package irvine.oeis.a000;

import java.io.Serializable;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000045.
 * @author Sean A. Irvine
 */
public class A000045 implements Sequence, Serializable {

  private Z mA = Z.NEG_ONE;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    final Z n = mA.add(mB);
    mA = mB;
    mB = n;
    return n;
  }
}

