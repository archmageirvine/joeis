package irvine.oeis.a297;
// manually 2024-03-11/moetra at 2024-03-18 14:36

import irvine.oeis.a253.A253564;
import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A297172 M\u00f6bius transform of A253564.
 * @author Georg Fischer
 */
public class A297172 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A297172() {
    super(1, new A253564(), 0);
    next();
  }
}
