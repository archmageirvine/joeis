package irvine.oeis.a145;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a003.A003221;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A145224 Triangle read by rows: T(n,k) is the number of even permutations (of an n-set) with exactly k fixed points.
 * @author Georg Fischer
 */
public class A145224 extends BaseTriangle {

  private final MemorySequence mSeq = MemorySequence.cachedSequence(new A003221());

  /** Construct the sequence. */
  public A145224() {
    super(0, 0, 0);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return Binomial.binomial(n, k).multiply(mSeq.a(n - k));
  }
}
