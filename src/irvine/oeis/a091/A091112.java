package irvine.oeis.a091;

import irvine.math.Mobius;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a061.A061686;

/**
 * A091112 Number of orbits of length n under the map whose periodic points are counted by A061686.
 * a(n) = (1/n)*Sum_{d|n} mu(d)*A061686(n/d).
 * @author Georg Fischer
 */
public class A091112 implements Sequence {

  protected int mN;
  protected MemorySequence mSeq;

  /** Construct the sequence. */
  public A091112() {
    this(new A061686());
  }

  /**
   * Generic constructor with parameters.
   * @param seq underlying sequence
   */
  public A091112(final Sequence seq) {
    mN = 0;
    mSeq = MemorySequence.cachedSequence(seq);
  }

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sumdiv(mN, d -> mSeq.a(mN / d).multiply(Mobius.mobius(d))).divide(mN);
  }
}
