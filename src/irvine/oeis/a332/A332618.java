package irvine.oeis.a332;
// Generated by gen_seq4.pl sumdiv at 2023-04-05 22:33

import irvine.math.IntegerUtils;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A332618 a(n) = Sum_{d|n} lcm(d, n/d) / gcd(d, n/d).
 * @author Georg Fischer
 */
public class A332618 extends AbstractSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A332618() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sumdiv(mN, d -> Z.valueOf(IntegerUtils.lcm(d, mN / d)).divide(IntegerUtils.gcd(d, mN / d)));
  }
}
