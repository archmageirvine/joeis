package irvine.oeis.a056;
// manually A060164/parm2 at 2022-03-25 13:13

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a124.A124303;
import irvine.oeis.memory.MemorySequence;

/**
 * A056478 Number of primitive (aperiodic) palindromic structures using a maximum of four different symbols.
 * a(n) = Sum_{d|n} mu(d)*A124303(ceiling(n/(2*d))) for n &gt; 0.
 * @author Georg Fischer
 */
public class A056478 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A056478(final int offset) {
    super(offset);
  }

  protected int mN;
  protected MemorySequence mSeq;

  /** Construct the sequence. */
  public A056478() {
    super(0);
    mN = -1;
    mSeq = MemorySequence.cachedSequence(new A124303());
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return Z.ONE;
    }
    return Integers.SINGLETON.sumdiv(mN, d -> mSeq.a(new Q(mN, 2L * d).ceiling().intValue()).multiply(Functions.MOBIUS.i(d)));
  }
}
