package irvine.oeis.a209;
// Generated by gen_seq4.pl 2024-06-23/lambdan at 2024-06-23 23:33

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A209635 M\u00f6bius mu-function applied to the odd part of n: a(n) = A008683(A000265(n)).
 * @author Georg Fischer
 */
public class A209635 extends LambdaSequence {

  /** Construct the sequence. */
  public A209635() {
    super(1, n -> Functions.MOBIUS.z(Functions.MAKE_ODD.z(n)));
  }
}
