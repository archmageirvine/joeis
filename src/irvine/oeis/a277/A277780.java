package irvine.oeis.a277;
// Generated by gen_seq4.pl 2024-11-10.ack/sintrif at 2024-11-10 23:25

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a000.A000578;
import irvine.oeis.a008.A008834;
import irvine.oeis.a050.A050985;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A277780 a(n) is the least k &gt; n such that n*k^2 is a cube.
 * @author Georg Fischer
 */
public class A277780 extends SingleTransformSequence {

  private static final DirectSequence A000578 = new A000578();
  private static final DirectSequence A008834 = new A008834();

  /** Construct the sequence. */
  public A277780() {
    super(1, (term, n) -> term.multiply(A000578.a(Z.ONE.add(Functions.CBRT.z(A008834.a(n))))), "", new A050985());
  }
}
