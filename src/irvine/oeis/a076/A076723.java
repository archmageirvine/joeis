package irvine.oeis.a076;
// Generated by gen_seq4.pl sumdiv at 2023-04-05 22:33

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A076723 Sum_{d divides n} (-d)^d.
 * @author Georg Fischer
 */
public class A076723 extends AbstractSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A076723() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sumdiv(mN, d -> Z.valueOf(-d).pow(d));
  }
}
