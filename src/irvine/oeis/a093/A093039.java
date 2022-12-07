package irvine.oeis.a093;

import irvine.oeis.recur.PaddingSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A093039 Sequence resulting from a sum of three repeated binomial(n+3,4) sequences.
 * @author Georg Fischer
 */
public class A093039 extends EulerTransform {

  /** Construct the sequence. */
  public A093039() {
    super(new PaddingSequence("2,4,-1", "0"), 1);
  }
}
