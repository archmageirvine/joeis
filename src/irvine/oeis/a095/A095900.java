package irvine.oeis.a095;
// manually 2026-11-06

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a004.A004001;

/**
 * A095900 a(n) = A004001(10^n).
 * @author Georg Fischer
 */
public class A095900 extends LambdaSequence {

  private static final DirectSequence A004001 = new A004001();

  /** Construct the sequence. */
  public A095900() {
    super(0, n -> A004001.a(Z.TEN.pow(n)));
  }
}
