package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000058 Sylvester's sequence: a(n+1) = a(n)^2 - a(n) + 1, with a(0) = 2.
 * @author Sean A. Irvine
 */
public class A000058 extends AbstractSequence {

  /* Construct the sequence. */
  public A000058() {
    super(0);
  }

  private Z mN = null;

  @Override
  public Z next() {
    if (mN == null) {
      mN = Z.TWO;
    } else {
      mN = mN.square().subtract(mN).add(1);
    }
    return mN;
  }
}

