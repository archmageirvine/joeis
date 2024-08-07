package irvine.oeis.a185;
// Generated by gen_seq4.pl 2024-04-10/lambdan at 2024-04-10 22:07

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A185055 Number of representations of 5^(2n) as a sum a^2 + b^2 + c^2 with 0 &lt; a &lt;= b &lt;= c.
 * @author Georg Fischer
 */
public class A185055 extends LambdaSequence {

  /** Construct the sequence. */
  public A185055() {
    super(0, n -> (Z.FIVE.pow(n).subtract(4L * n + 1)).divide(8));
  }
}
