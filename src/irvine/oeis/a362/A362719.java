package irvine.oeis.a362;
// Generated by gen_seq4.pl 2024-05-22/lambdan at 2024-05-22 22:35

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A362719 Number of numbers k, 1 &lt;= k &lt;= n, such that phi(k) = phi(n-k+1).
 * @author Georg Fischer
 */
public class A362719 extends LambdaSequence {

  /** Construct the sequence. */
  public A362719() {
    super(1, n -> Integers.SINGLETON.sum(1, n, k -> Functions.PHI.z(k).equals(Functions.PHI.z(n - k + 1)) ? Z.ONE : Z.ZERO));
  }
}
