package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A085494 Numbers k having exactly one partition into distinct divisors of k+1.
 * @author Sean A. Irvine
 */
public class A085494 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A085494() {
    super(1, 1, new A085491().skip(), Z.ONE);
  }
}
