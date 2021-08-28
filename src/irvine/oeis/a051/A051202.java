package irvine.oeis.a051;

import irvine.oeis.PositionSequence;
import irvine.oeis.a005.A005210;

/**
 * A051202 Numbers n such that A005210(n) = 0.
 * @author Sean A. Irvine
 */
public class A051202 extends PositionSequence {

  /** Construct the sequence. */
  public A051202() {
    super(1, new A005210(), 0);
  }
}
