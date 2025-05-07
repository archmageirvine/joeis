package irvine.oeis.a101;

import irvine.oeis.transform.InverseMobiusTransformSequence;

/**
 * A101172 Sequence whose Mobius transform leads to the first differences of the terms.
 * @author Sean A. Irvine
 */
public class A101172 extends InverseMobiusTransformSequence {

  /** Construct the sequence. */
  public A101172() {
    super(1, new A101173(), 0);
    next();
  }
}
