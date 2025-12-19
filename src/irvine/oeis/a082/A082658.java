package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A082658 Integers expressible as the sum of a square and a triangular number in exactly two distinct ways.
 * @author Sean A. Irvine
 */
public class A082658 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A082658() {
    super(1, new A082660(), Z.TWO::equals);
  }
}
