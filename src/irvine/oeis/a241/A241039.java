package irvine.oeis.a241;
// manually 2023-09-07/lambda at 2023-09-07 19:13

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A241039 Cyclotomic(n,2048).
 * @author Georg Fischer
 */
public class A241039 extends LambdaSequence {

  private final int mN = -1;

  /** Construct the sequence. */
  public A241039() {
    super(0, n -> (n == 0) ? Z.ONE : Functions.CYCLOTOMIC.z(n, 2048));
  }
}
