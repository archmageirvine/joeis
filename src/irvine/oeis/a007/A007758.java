package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007758.
 * @author Sean A. Irvine
 */
public class A007758 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).square().shiftLeft(mN);
  }
}
