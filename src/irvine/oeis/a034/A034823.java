package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001385;

/**
 * A034823 Number of n-node rooted trees of height at most 6.
 * @author Sean A. Irvine
 */
public class A034823 extends PrependSequence {

  /** Construct the sequence. */
  public A034823() {
    super(new EulerTransformSequence(new A001385(), 1), Z.ONE);
  }
}
