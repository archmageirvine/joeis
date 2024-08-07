package irvine.oeis.a338;
// Generated by gen_seq4.pl 2024-07-31/lambdan at 2024-07-31 22:55

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A338589 Sum of the remainders (s*t mod n), where s + t = n and 1 &lt;= s &lt;= t.
 * @author Georg Fischer
 */
public class A338589 extends LambdaSequence {

  /** Construct the sequence. */
  public A338589() {
    super(1, n -> Integers.SINGLETON.sum(1, n / 2, i -> Z.valueOf(i).multiply(n - i).modZ(n)));
  }
}
