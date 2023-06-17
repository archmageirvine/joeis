package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A002561 a(n) = n^5 + 1.
 * @author Sean A. Irvine
 */
public class A002561 extends AbstractSequence {

  /** Construct the sequence. */
  public A002561() {
    super(-1);
  }

  private Z mN = Z.valueOf(-2);

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.pow(5).add(1);
  }
}
