package irvine.oeis.a131;
// Generated by gen_seq4.pl 2024-01-11/lambdan at 2024-01-11 11:50

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a068.A068451;

/**
 * A131444 Denominators of n-th approximation of factorial (also called harmonic) expansion of the golden ratio phi (A001622).
 * @author Georg Fischer
 */
public class A131444 extends LambdaSequence {

  /** Construct the sequence. */
  public A131444() {
    super(1, n -> {
      final A068451 mSeq = new A068451();
      return Rationals.SINGLETON.sum(1, n, k -> new Q(mSeq.next(), Functions.FACTORIAL.z(k))).den();
    });
  }
}
