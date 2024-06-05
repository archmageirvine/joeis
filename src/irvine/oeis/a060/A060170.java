package irvine.oeis.a060;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a005.A005809;
import irvine.oeis.memory.MemorySequence;

/**
 * A060170 Number of orbits of length n under the map whose periodic points are counted by A005809.
 * a(n) = (1/n)* Sum_{d|n} mu(n/d)*A005809(d).
 * @author Georg Fischer
 */
public class A060170 extends Sequence1 {

  protected int mN;
  protected MemorySequence mSeq;

  /** Construct the sequence. */
  public A060170() {
    this(new A005809());
  }

  /**
   * Generic constructor with parameters.
   * @param seq underlying sequence
   */
  public A060170(final Sequence seq) {
    mN = 0;
    mSeq = MemorySequence.cachedSequence(seq);
  }

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sumdiv(mN, d -> mSeq.a(d).multiply(Functions.MOBIUS.i(mN / d))).divide(mN);
  }
}
