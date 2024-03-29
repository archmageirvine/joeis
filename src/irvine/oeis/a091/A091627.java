package irvine.oeis.a091;
// Generated by gen_seq4.pl 2024-03-22/lambdan at 2024-03-24 22:44

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A091627 Number of ordered integer pairs (b,c) with 1 &lt;= b,c &lt;= n such that both roots of x^2+bx+c=0 are integers.
 * @author Georg Fischer
 */
public class A091627 extends LambdaSequence {

  /** Construct the sequence. */
  public A091627() {
    super(0, n -> Integers.SINGLETON.sum(1, n, i -> Integers.SINGLETON.sum(i, n - i, j -> Z.valueOf(i * j <= n ? 1 : 0))));
  }
}
