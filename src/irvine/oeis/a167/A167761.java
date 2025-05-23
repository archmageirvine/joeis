package irvine.oeis.a167;
// Generated by gen_seq4.pl 2024-11-10.ack/lambdan at 2024-11-10 23:25

import irvine.math.function.Functions;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;

/**
 * A167761 a(n) = sqrt(A167657(n)).
 * @author Georg Fischer
 */
public class A167761 extends LambdaSequence {

  private static final DirectSequence A167657 = new A167657();

  /** Construct the sequence. */
  public A167761() {
    super(1, n -> Functions.SQRT.z(A167657.a(n)));
  }
}
