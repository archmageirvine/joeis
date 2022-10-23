package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000302 Powers of 4: a(n) = 4^n.
 * @author Sean A. Irvine
 */
public class A000302 extends Sequence0 {

  protected int mN = -2;

  @Override
  public Z next() {
    mN += 2;
    return Z.ONE.shiftLeft(mN);
  }
}

