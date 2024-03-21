package irvine.oeis.a297;
// manually 2024-03-11/moetra at 2024-03-18 14:36

import irvine.oeis.a243.A243354;
import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A297156 Moebius transform of A243354.
 * @author Georg Fischer
 */
public class A297156 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A297156() {
    super(1, new A243354(), 0);
    next();
  }
}
