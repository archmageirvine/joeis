package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000302 Powers of 4: <code>a(n) = 4^n</code>.
 * @author Sean A. Irvine
 */
public class A000302 implements Sequence {

  protected int mN = -2;

  @Override
  public Z next() {
    mN += 2;
    return Z.ONE.shiftLeft(mN);
  }
}

