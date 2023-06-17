package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A001755 Lah numbers: a(n) = n! * binomial(n-1, 3)/4!.
 * @author Sean A. Irvine
 */
public class A001755 extends AbstractSequence {

  /** Construct the sequence. */
  public A001755() {
    super(4);
  }

  private long mN = 3;
  private Z mF = Z.SIX;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return mF.multiply(mN - 1).multiply(mN - 2).multiply(mN - 3).divide(144);
  }
}
