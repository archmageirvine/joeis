package irvine.oeis.a344;
// Generated by gen_seq4.pl 2024-07-21/lambdan at 2024-07-22 00:06

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A344374 a(n) is the number of squarefree numbers appearing in the 1st column of an n X n square array whose elements are the numbers from 1..n^2, listed in increasing order by rows.
 * @author Georg Fischer
 */
public class A344374 extends LambdaSequence {

  /** Construct the sequence. */
  public A344374() {
    super(1, n -> Integers.SINGLETON.sum(1, n, k -> Functions.MOEBIUS.z(1 + n * (k - 1)).square()));
  }
}
