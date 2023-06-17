package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A010790 a(n) = n!*(n+1)!.
 * @author Sean A. Irvine
 */
public class A010790 extends AbstractSequence {

  /* Construct the sequence. */
  public A010790() {
    super(0);
  }

  private long mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    final Z r = mF;
    mF = mF.multiply(++mN);
    return r.multiply(mF);
  }
}
