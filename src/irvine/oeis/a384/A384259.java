package irvine.oeis.a384;
// Generated by gen_seq4.pl 2025-05-24.ack/lambdan at 2025-05-24 23:04

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A384259 a(n) = Product_{k=0..n-1} (n+4*k+3).
 * @author Georg Fischer
 */
public class A384259 extends LambdaSequence {

  /** Construct the sequence. */
  public A384259() {
    super(0, n -> Integers.SINGLETON.product(0, n - 1, k -> Z.valueOf(n + 4 * k + 3)));
  }
}
