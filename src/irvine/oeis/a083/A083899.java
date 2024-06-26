package irvine.oeis.a083;
// Generated by gen_seq4.pl 2024-04-01/lambdan at 2024-04-01 22:42

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A083899 Number of divisors of n with largest digit &lt;= 4 (base 10).
 * @author Georg Fischer
 */
public class A083899 extends LambdaSequence {

  /** Construct the sequence. */
  public A083899() {
    super(1, n -> Integers.SINGLETON.sumdiv(n, d -> Functions.DIGIT_SORT_ASCENDING.l(d) % 10 <= 4 ? Z.ONE : Z.ZERO));
  }
}
