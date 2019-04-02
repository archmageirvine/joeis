package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PrependSequence;

/**
 * A001385 Number of n-node trees of height at most 5.
 * @author Sean A. Irvine
 */
public class A001385 extends PrependSequence {

  /** Construct the sequence. */
  public A001385() {
    super(new EulerTransformSequence(new A001384(), 1), Z.ONE);
  }
}
