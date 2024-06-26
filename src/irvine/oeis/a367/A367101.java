package irvine.oeis.a367;
// Generated by gen_seq4.pl 2024-06-17/lambdan at 2024-06-17 23:19

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a000.A000009;

/**
 * A367101 a(n) = Sum_{k=0..n} A000108(k) * A000009(k).
 * @author Georg Fischer
 */
public class A367101 extends LambdaSequence {

  private static final DirectSequence A000009 = new A000009();

  /** Construct the sequence. */
  public A367101() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Functions.CATALAN.z(k).multiply(A000009.a(k))));
  }
}
