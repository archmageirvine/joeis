package irvine.oeis.a328;
// Generated by gen_seq4.pl 2024-06-17/lambdan at 2024-06-17 23:19

import irvine.math.function.Functions;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a007.A007814;
import irvine.oeis.a276.A276156;

/**
 * A328461 a(n) = A276156(n) / A002110(A007814(n)).
 * @author Georg Fischer
 */
public class A328461 extends LambdaSequence {

  private static final DirectSequence A007814 = new A007814();
  private static final DirectSequence A276156 = new A276156();

  /** Construct the sequence. */
  public A328461() {
    super(1, n -> A276156.a(n).divide(Functions.PRIMORIAL_COUNT.z(A007814.a(n))));
  }
}
