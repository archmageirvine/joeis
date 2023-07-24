package irvine.oeis.a064;

import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A064693 Number of connected components remaining when decimal expansion of the number n is cut from a piece of paper.
 * @author Sean A. Irvine
 */
public class A064693 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A064693() {
    super(new A064692(), k -> k.add(1));
  }
}
