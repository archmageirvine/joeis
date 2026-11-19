package irvine.oeis.a304;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A304069 Number of simple graphs on n vertices rooted at one oriented edge.
 * @author Gregory Morse
 */
public class A304069 extends SimpleTransformSequence {
  /** Construct the sequence. */
  public A304069() {
    super(1, new A304070(), Z::divide2);
  }
}
