package irvine.oeis.a054;

import irvine.oeis.a000.A000011;
import irvine.oeis.transform.InverseMobiusTransformSequence;

/**
 * A054181 Inverse Moebius transform of A000011 (starting at term 0).
 * @author Sean A. Irvine
 */
public class A054181 extends InverseMobiusTransformSequence {

  /** Construct the sequence. */
  public A054181() {
    super(0, new A000011(), 0);
    next();
  }
}
