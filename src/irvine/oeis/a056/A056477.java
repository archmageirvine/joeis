package irvine.oeis.a056;
// manually A060164/parm2 at 2022-03-25 13:13

import irvine.math.Mobius;
import irvine.math.q.Q;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.MemorySequence;
import irvine.oeis.a124.A124302;

/**
 * A056477 Number of primitive (aperiodic) palindromic structures using a maximum of three different symbols.
 * a(n) = Sum_{d|n} mu(d)*A124302(ceiling(n/(2*d))) for n &gt; 0.
 * @author Georg Fischer
 */
public class A056477 extends AbstractSequence {

  protected int mN;
  protected MemorySequence mSeq;

  /** Construct the sequence. */
  public A056477() {
    super(0);
    mN = -1;
    mSeq = MemorySequence.cachedSequence(new A124302());
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return Z.ONE;
    }
    return Integers.SINGLETON.sumdiv(mN, d -> mSeq.a(new Q(mN, 2L * d).ceiling().intValue()).multiply(Mobius.mobius(d)));
  }
}
