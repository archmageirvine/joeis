package irvine.oeis.a064;

import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A064532 Total number of holes in decimal expansion of the number n, assuming 4 has no hole.
 * @author Sean A. Irvine
 */
public class A064532 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A064532() {
    super(new A064531(), k -> k.subtract(1));
  }
}

