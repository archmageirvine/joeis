package irvine.oeis.a056;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000920;
import irvine.oeis.memory.MemorySequence;

/**
 * A056271 A056271 Number of primitive (aperiodic) words of length n which contain exactly six different symbols.
 * Sum mu(d)*A000920(n/d) where d|n.
 * @author Georg Fischer
 */
public class A056271 extends Sequence1 {

  protected int mN;
  protected MemorySequence mSeq;

  /** Construct the sequence. */
  public A056271() {
    this(new A000920());
  }

  /**
   * Generic constructor with parameters.
   * @param seq underlying sequence
   */
  public A056271(final Sequence seq) {
    mN = 0;
    mSeq = MemorySequence.cachedSequence(seq);
    mSeq.add(Z.ZERO);
  }

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sumdiv(mN, d -> mSeq.a(mN / d).multiply(Functions.MOBIUS.i(d)));
  }
}
