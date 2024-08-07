package irvine.oeis.a283;
// Generated by gen_seq4.pl 2024-07-05/lambdan at 2024-07-05 23:59

import irvine.math.function.Functions;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a004.A004001;
import irvine.oeis.a080.A080677;
import irvine.oeis.memory.MemorySequence;

/**
 * A283677 a(n) = lcm(b(b(n)), b(n-b(n)+1)) where b(n) = A004001(n).
 * @author Georg Fischer
 */
public class A283677 extends LambdaSequence {

  private static final DirectSequence A080677 = new A080677();
  private static final MemorySequence A004001 = new A004001();

  /** Construct the sequence. */
  public A283677() {
    super(1, n -> Functions.LCM.z(A004001.a(A004001.a(n - 1).subtract(1)), A004001.a(A080677.a(n).subtract(1))));
  }
}
