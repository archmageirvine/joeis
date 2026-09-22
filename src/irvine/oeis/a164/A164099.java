package irvine.oeis.a164;

import irvine.oeis.a243.A243321;
import irvine.oeis.transform.EulerTransform;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A164099 Number of planar graphs with n nodes and chromatic number 2.
 * @author Sean A. Irvine
 */
public class A164099 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A164099() {
    super(1, new EulerTransform(1, new A243321()).skip(), k -> k.subtract(1));
  }
}
