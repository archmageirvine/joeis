package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A011545 Decimal expansion of Pi truncated to n places.
 * @author Sean A. Irvine
 */
public class A011545 extends AbstractSequence {

  /** Construct the sequence. */
  public A011545() {
    super(0);
  }

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(10);
    return CR.PI.multiply(mA).floor();
  }
}
