package irvine.oeis.a071;
// manually 2024-02-22

import irvine.factor.prime.Puma;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a000.A000720;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A071986 Parity of the prime-counting function pi(n).
 * Formula: <code>a(n) = A000035(A000720(n)).</code>
 * @author Georg Fischer
 */
public class A071986 extends SimpleTransformSequence implements DirectSequence {

  /** Construct the sequence. */
  public A071986() {
    super(1, new A000720(), v -> v.and(Z.ONE));
  }

  @Override
  public Z a(final Z n) {
    return Puma.primePiZ(n).and(Z.ONE);
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

}
