package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A082659 Integers expressible as the sum of a square and a triangular number in exactly three distinct ways.
 * @author Sean A. Irvine
 */
public class A082659 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A082659() {
    super(1, new A082660(), Z.THREE::equals);
  }
}
