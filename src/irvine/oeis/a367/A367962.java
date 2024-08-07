package irvine.oeis.a367;
// Generated by gen_seq4.pl 2024-07-13/trilambn at 2024-07-13 23:12

import irvine.oeis.DirectSequence;
import irvine.oeis.a000.A000522;
import irvine.oeis.a094.A094587;
import irvine.oeis.triangle.DirectArray;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A367962 Triangle read by rows. T(n, k) = Sum_{j=0..k} (n!/j!).
 * @author Georg Fischer
 */
public class A367962 extends LambdaTriangle {

  private static final DirectSequence A000522 = new A000522();
  private static final DirectArray A094587 = new A094587();

  /** Construct the sequence. */
  public A367962() {
    super(0, 0, 0, (n, k) -> A094587.a(n, k).multiply(A000522.a(k)));
  }
}
