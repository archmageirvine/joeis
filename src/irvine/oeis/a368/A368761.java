package irvine.oeis.a368;
// Generated by gen_seq4.pl 2024-07-27.ack/lambdan at 2024-07-27 22:17

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A368761 Number of labeled split graphs on n vertices such that {1..k} is independent and {k+1..n} is a clique for some k in {0..n}.
 * @author Georg Fischer
 */
public class A368761 extends LambdaSequence {

  /** Construct the sequence. */
  public A368761() {
    super(1, n -> Z.ONE.add(Integers.SINGLETON.sum(1, n - 1, k -> Z.TWO.pow(k).subtract(Z.ONE).multiply(Z.TWO.pow(Z.valueOf(n - 1 - k).multiply(Z.valueOf(k)))))));
  }
}
