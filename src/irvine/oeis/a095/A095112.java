package irvine.oeis.a095;
// Generated by gen_seq4.pl sumdiv2/sumdiv at 2023-04-10 10:08

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A095112 a(n) is the sum of n/k over all prime powers k &gt; 1 which divide n.
 * @author Georg Fischer
 */
public class A095112 extends AbstractSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A095112() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sumdiv(mN, d -> (1 == Functions.OMEGA.i(d)) ? Z.valueOf(mN / d) : Z.ZERO);
  }
}
