package irvine.oeis.a060;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001641;
import irvine.oeis.memory.MemorySequence;

/**
 * A060166 Number of orbits of length n under the map whose periodic points are counted by A001641.
 * a(n) = (1/n)* Sum_{d|n} mu(d)*A001641(n/d).
 * @author Georg Fischer
 */
public class A060166 extends Sequence1 {

  protected int mN;
  protected MemorySequence mSeq;

  /** Construct the sequence. */
  public A060166() {
    this(new A001641());
  }

  /**
   * Generic constructor with parameter.
   * @param seq underlying sequence
   */
  public A060166(final Sequence seq) {
    mN = 0;
    mSeq = MemorySequence.cachedSequence(seq);
    mSeq.add(Z.ZERO);
  }

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sumdiv(mN, d -> mSeq.a(mN / d).multiply(Functions.MOBIUS.i(d))).divide(mN);
  }
}
