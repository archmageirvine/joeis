package irvine.oeis.a374;
// Generated by gen_seq4.pl 2024-07-02/lambdan at 2024-07-03 22:28

import irvine.math.function.Functions;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a007.A007949;

/**
 * A374133 The 3-adic valuation of A276085(n), where A276085 is the primorial base log-function.
 * @author Georg Fischer
 */
public class A374133 extends LambdaSequence {

  private static final DirectSequence A007949 = new A007949();

  /** Construct the sequence. */
  public A374133() {
    super(2, n -> A007949.a(Functions.PRIMORIAL_BASE_LOG.z(n)));
  }
}
