package irvine.oeis.a067;

import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A067071 Numbers with no zeros such that the product of the digits of its cube is also a cube.
 * @author Sean A. Irvine
 */
public class A067071 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A067071() {
    super(0, new A067070(), k -> k.root(3));
  }
}
