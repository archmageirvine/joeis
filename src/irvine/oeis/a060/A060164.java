package irvine.oeis.a060;

import irvine.math.Mobius;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000364;

/**
 * A060164 Number of orbits of length n under the map whose periodic points are counted by A000364.
 * a(n) = (1/n)* Sum_{d|n} mu(d)*A000364(n/d).
 * @author Georg Fischer
 */
public class A060164 extends Sequence1 {

  protected int mN;
  protected MemorySequence mSeq;

  /** Construct the sequence. */
  public A060164() {
    this(new A000364());
  }

  /**
   * Generic constructor with parameter.
   * @param seq underlying sequence
   */
  public A060164(final Sequence seq) {
    mN = 0;
    mSeq = MemorySequence.cachedSequence(seq);
  }

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sumdiv(mN, d -> mSeq.a(mN / d).multiply(Mobius.mobius(d))).divide(mN);
  }
}
