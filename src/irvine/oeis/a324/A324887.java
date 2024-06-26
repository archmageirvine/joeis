package irvine.oeis.a324;
// Generated by gen_seq4.pl 2024-06-16/lambdan at 2024-06-16 23:57

import irvine.math.function.Functions;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a108.A108951;

/**
 * A324887 a(n) = A108951(n) * A276086(A108951(n)).
 * @author Georg Fischer
 */
public class A324887 extends LambdaSequence {

  private static final DirectSequence A108951 = new A108951();

  /** Construct the sequence. */
  public A324887() {
    super(1, n -> A108951.a(n).multiply(Functions.PRIMORIAL_BASE_EXP.z(A108951.a(n))));
  }
}
