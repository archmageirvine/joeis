package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A050942 Numbers that are not the sum of 2 or more consecutive nonzero triangular numbers.
 * @author Sean A. Irvine
 */
public class A050942 extends ComplementSequence {

  /** Construct the sequence. */
  public A050942() {
    super(new A050943(), Z.ONE);
  }
}
