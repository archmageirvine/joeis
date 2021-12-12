package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.transform.EulerTransformSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000041;

/**
 * A001383 Number of n-node rooted trees of height at most 3.
 * @author Sean A. Irvine
 */
public class A001383 extends PrependSequence {

  /** Construct the sequence. */
  public A001383() {
    super(new EulerTransformSequence(new A000041(), 0), Z.ONE);
  }
}
