package irvine.oeis.a348;
// Generated by gen_seq4.pl sumdiv at 2023-04-05 22:33

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A348144 a(n) = Sum_{d|n} n^(n^2/d).
 * @author Georg Fischer
 */
public class A348144 extends AbstractSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A348144() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sumdiv(mN, d -> Z.valueOf(mN).pow((long) mN * mN / d));
  }
}
