package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A002491 Smallest number of stones in Tchoukaillon (or Mancala, or Kalahari) solitaire that make use of n-th hole.
 * @author Sean A. Irvine
 */
public class A002491 extends AbstractSequence {

  /** Construct the sequence. */
  public A002491() {
    super(1);
  }

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    Z m = mN;
    mN = mN.add(1);
    Z a = mN;
    while (m.signum() > 0) {
      final Z t = m.subtract(1);
      a = a.add(t).divide(m).multiply(m);
      m = t;
    }
    return a;
  }
}
