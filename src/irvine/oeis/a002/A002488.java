package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A002488 a(n) = n^(n^n).
 * @author Sean A. Irvine
 */
public class A002488 extends AbstractSequence {

  /** Construct the sequence. */
  public A002488() {
    super(-1);
  }

  private Z mN = Z.valueOf(-2);

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.pow(mN.pow(mN.intValueExact()).intValueExact());
  }
}
