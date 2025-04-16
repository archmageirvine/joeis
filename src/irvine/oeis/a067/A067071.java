package irvine.oeis.a067;

import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A067071 Numbers with no zeros in their cubes such that the products of the digits of their cubes are also cubes.
 * @author Sean A. Irvine
 */
public class A067071 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A067071() {
    super(1, new A067070(), k -> k.root(3));
  }
}
