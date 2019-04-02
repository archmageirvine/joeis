package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PrependSequence;

/**
 * A034824 Number of n-node rooted trees of height at most 7.
 * @author Sean A. Irvine
 */
public class A034824 extends PrependSequence {

  /** Construct the sequence. */
  public A034824() {
    super(new EulerTransformSequence(new A034823(), 1), Z.ONE);
  }
}
