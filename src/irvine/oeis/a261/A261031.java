package irvine.oeis.a261;
// manually etman at 2023-02-06 12:43

import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000032;
import irvine.oeis.transform.EulerTransform;

/**
 * A261031 Euler transform of Lucas numbers.
 * @author Georg Fischer
 */
public class A261031 extends EulerTransform {

  /** Construct the sequence. */
  public A261031() {
    super(0, new SkipSequence(new A000032(), 1), 1);
  }
}
