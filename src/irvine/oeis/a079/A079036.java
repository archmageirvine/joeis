package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A079036 Squares of these numbers have all their digits occurring in groups of 2 or more, without ending in zero.
 * @author Sean A. Irvine
 */
public class A079036 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A079036() {
    super(1, new A079035(), Z::sqrt);
  }
}
