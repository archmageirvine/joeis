package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.InverseSequence;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A033261 Position of first occurrence of n in the continued fraction for the Laplace's limit constant.
 * @author Sean A. Irvine
 */
public class A033261 extends SimpleTransformSequence {

  // This add 1 is due to offset change in A033151

  /** Construct the sequence. */
  public A033261() {
    super(new InverseSequence(1, new A033260(), 1), Z.ONE::add);
  }
}
