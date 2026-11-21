package irvine.oeis.a131;

import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A131673 Size of the largest BDD of symmetric Boolean functions of n variables when the sink nodes are counted.
 * @author Gregory Morse
 */
public class A131673 extends SimpleTransformSequence {
  /** Construct the sequence. */
  public A131673() {
    super(0, new A131674(), (n, v) -> v.add(n == 0 ? 1 : 2));
  }
}
