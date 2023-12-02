package irvine.oeis.a067;

import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A067037.
 * @author Sean A. Irvine
 */
public class A067071 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A067071() {
    super(1, new A067070(), k -> k.root(3));
  }
}
