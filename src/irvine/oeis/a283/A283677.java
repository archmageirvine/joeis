package irvine.oeis.a283;
// manually 2026-11-06

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a004.A004001;

/**
 * A283677 a(n) = lcm(b(b(n)), b(n-b(n)+1)) where b(n) = A004001(n).
 * @author Georg Fischer
 */
public class A283677 extends LambdaSequence {

  private static final DirectSequence A004001 = new A004001();

  /** Construct the sequence. */
  public A283677() {
    super(1, n -> {
      final Z bn = A004001.a(n);
      return Functions.LCM.z(A004001.a(bn), A004001.a(Z.valueOf(n + 1).subtract(bn)));
    });
  }
}
