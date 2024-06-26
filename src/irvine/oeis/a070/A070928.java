package irvine.oeis.a070;
// Generated by gen_seq4.pl 2024-04-17/lambdan at 2024-04-17 19:29

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A070928 Smallest integer &gt;= 0 of the form x^4 - n^3.
 * @author Georg Fischer
 */
public class A070928 extends LambdaSequence {

  /** Construct the sequence. */
  public A070928() {
    super(1, n -> CR.valueOf(n).pow(new Q(3, 4)).ceil().pow(4).subtract(Z.valueOf(n).pow(3)));
  }
}
