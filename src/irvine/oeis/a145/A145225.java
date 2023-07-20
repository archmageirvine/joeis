package irvine.oeis.a145;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000387;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A145225 T(n,k) is the number of odd permutations (of an n-set) with exactly k fixed points.
 * @author Georg Fischer
 */
public class A145225 extends BaseTriangle {

  private final MemorySequence mSeq = MemorySequence.cachedSequence(new A000387());

  /** Construct the sequence. */
  public A145225() {
    super(0, 0, 0);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return Binomial.binomial(n, k).multiply(mSeq.a(n - k));
  }
}
