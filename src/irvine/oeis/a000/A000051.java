package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000051 a(n) = 2^n + 1.
 * @author Sean A. Irvine
 */
public class A000051 extends AbstractSequence {

  /** Construct the sequence. */
  public A000051() {
    super(0);
  }

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    final Z r = mN.add(1);
    mN = mN.multiply2();
    return r;
  }
}

