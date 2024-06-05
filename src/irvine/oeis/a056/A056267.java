package irvine.oeis.a056;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000918;
import irvine.oeis.memory.MemorySequence;

/**
 * A056267 Number of primitive (aperiodic) words of length n which contain exactly two different symbols.
 * a(n) = Sum_{d|n} mu(d)*A000918(n/d),
 * @author Georg Fischer
 */
public class A056267 extends Sequence1 {

  protected int mN;
  protected MemorySequence mSeq;

  /** Construct the sequence. */
  public A056267() {
    this(new A000918());
  }

  /**
   * Generic constructor with parameters.
   * @param seq underlying sequence
   */
  public A056267(final Sequence seq) {
    mN = 0;
    mSeq = MemorySequence.cachedSequence(seq);
  }

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sumdiv(mN, d -> mSeq.a(mN / d).multiply(Functions.MOBIUS.i(d)));
  }
}

