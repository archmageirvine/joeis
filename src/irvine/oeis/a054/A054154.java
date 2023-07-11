package irvine.oeis.a054;

import irvine.oeis.a001.A001037;
import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A054154 Moebius transform of A001037 (starting at term 0).
 * @author Sean A. Irvine
 */
public class A054154 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A054154() {
    super(0, new A001037(), 0);
    next();
  }
}
