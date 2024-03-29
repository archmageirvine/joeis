package irvine.oeis.a140;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000166;

/**
 * A140526 Number of derangements of n elements with one pair repeated exactly once (e.g., "ABABCDEF").
 * @author Georg Fischer
 */
public class A140526 extends AbstractSequence {

  final Sequence mA000166 = new A000166();
  protected long mN;

  /** Construct the sequence. */
  public A140526() {
    super(4);
    mN = 3;
  }

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).pow(Z.FOUR).subtract(Z.TEN.multiply(Z.valueOf(mN).pow(Z.THREE))).add(Z.valueOf(37).multiply(Z.valueOf(mN).square())).subtract(Z.valueOf(56).multiply(Z.valueOf(mN))).add(Z.valueOf(25)).multiply(mA000166.next()).add((Z.NEG_ONE.pow(mN)).multiply(Z.valueOf(mN).pow(Z.THREE).negate().add(Z.EIGHT.multiply(Z.valueOf(mN).square())).subtract(Z.valueOf(22).multiply(Z.valueOf(mN))).add(Z.valueOf(19)))).divide(Z.FOUR);
  }

}
