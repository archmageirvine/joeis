package irvine.oeis.a270;
// Generated by gen_seq4.pl 2024-06-17/lambdan at 2024-06-17 23:19

import irvine.math.function.Functions;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a007.A007504;

/**
 * A270828 a(n) = (Sum_{k=1..2n-1} prime(k)) mod prime(n).
 * @author Georg Fischer
 */
public class A270828 extends LambdaSequence {

  private static final DirectSequence A007504 = new A007504();

  /** Construct the sequence. */
  public A270828() {
    super(1, n -> A007504.a(2 * n - 1).mod(Functions.PRIME.z(n)));
  }
}
