package irvine.oeis.a136;
// Generated by gen_seq4.pl 2025-02-03.ack/lambdan at 2025-02-03 18:14

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;

/**
 * A136485 Number of unit square lattice cells enclosed by origin centered circle of diameter n.
 * @author Georg Fischer
 */
public class A136485 extends LambdaSequence {

  private static final DirectSequence A136513 = new A136513();

  /** Construct the sequence. */
  public A136485() {
    super(1, n -> Z.TWO.multiply(A136513.a(n)));
  }
}
