package irvine.oeis.a347;
// Generated by gen_seq4.pl 2023-09-04/lambda at 2023-09-04 22:21

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A347160 Sum of 4th powers of distinct prime divisors of n that are &lt;= sqrt(n).
 * nonn
 * @author Georg Fischer
 */
public class A347160 extends LambdaSequence {

  /** Construct the sequence. */
  public A347160() {
    super(1, n -> Integers.SINGLETON.sumdiv(n, d -> (d * d <= n && Z.valueOf(d).isProbablePrime()) ? Z.valueOf(d).pow(4) : Z.ZERO));
  }
}
