package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.transform.LogarithmicTransformSequence;
import irvine.oeis.PrependSequence;

/**
 * A007108 Number of connected labeled 2-regular digraphs with n nodes.
 * @author Sean A. Irvine
 */
public class A007108 extends PrependSequence {

  /** Construct the sequence. */
  public A007108() {
    super(new LogarithmicTransformSequence(new A007107(), 1), Z.ZERO);
  }
}
