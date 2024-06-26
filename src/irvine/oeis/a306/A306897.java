package irvine.oeis.a306;
// Generated by gen_seq4.pl sumdiv at 2023-04-05 22:33

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A306897 a(n) = A306896(n)/6.
 * @author Georg Fischer
 */
public class A306897 extends AbstractSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A306897() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sumdiv(mN, d -> Z.ONE.shiftLeft(d).add(((d & 1) == 0) ? 2 : -2).multiply(Functions.PHI.z(mN / d)).divide(6));
  }
}
