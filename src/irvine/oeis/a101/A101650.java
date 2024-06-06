package irvine.oeis.a101;
//manually 2024-06-06

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a002.A002487;

/**
 * A101650 A Thue-Morse-Stern sequence.
 * @author Georg Fischer
 */
public class A101650 extends LambdaSequence {

  private static final DirectSequence A002487 = new A002487();

  /** Construct the sequence. */
  public A101650() {
    super(0, n -> (n == 0) ? Z.ZERO : A002487.a(n + 1).subtract(1).mod(Z.THREE));
  }
}
