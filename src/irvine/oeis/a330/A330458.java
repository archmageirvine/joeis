package irvine.oeis.a330;
// manually euleras at 2021-11-24 08:09

import irvine.oeis.EulerTransform;
import irvine.oeis.SkipSequence;
import irvine.oeis.a261.A261049;

/**
 * A330458 Number of multisets of nonempty sets of nonempty multisets of positive integers with total sum n.
 * @author Georg Fischer
 */
public class A330458 extends EulerTransform {

  /** Construct the sequence. */
  public A330458() {
    super(new SkipSequence(new A261049(), 1), 1);
  }
}
