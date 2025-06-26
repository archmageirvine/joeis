package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A078264 Integer part of the geometric mean of the forward and reverse concatenations of 1 to n.
 * @author Sean A. Irvine
 */
public class A078264 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A078264() {
    super(new A078263(), Z::sqrt);
  }
}

