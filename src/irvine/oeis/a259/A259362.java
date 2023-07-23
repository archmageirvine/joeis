package irvine.oeis.a259;
// manually sigman0/sigma0 at 2023-02-28 16:08

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a253.A253641;

/**
 * A259362 a(1) = 1, for n &gt; 1: a(n) is the number of ways to write n as a nontrivial perfect power.
 * @author Georg Fischer
 */
public class A259362 extends AbstractSequence {

  private final A253641 mSeq1 = new A253641();

  /** Construct the sequence. */
  public A259362() {
    super(1);
  }

  private int mN = 0;

  {
    mSeq1.next();
  }

  @Override
  public Z next() {
    ++mN;
    final Z result = Jaguar.factor(mSeq1.next()).sigma0().subtract(1);
    return (mN == 1) ? Z.ONE : result;
  }
}
