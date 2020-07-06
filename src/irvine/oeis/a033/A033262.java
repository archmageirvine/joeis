package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.RecordSequence;

/**
 * A033262 Incrementally largest terms in the continued fraction for Laplace's limit constant.
 * @author Sean A. Irvine
 */
public class A033262 extends RecordSequence {

  /** Construct the sequence. */
  public A033262() {
    super(new A033260(), Z.ZERO);
  }
}
