package irvine.oeis.a328;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001227;
import irvine.oeis.a002.A002131;

/**
 * A328203 Expansion of Sum_{k&gt;=1} k * x^k / (1 - x^(2*k))^2.
 * @author Georg Fischer
 */
public class A328203 extends Sequence1 {

  final Sequence mA001227 = new A001227();
  final Sequence mA002131 = new A002131();
  protected long mN;
  /** Construct the sequence. */
  public A328203() {
    mN = 0;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).multiply(mA001227.next()).add(mA002131.next()).divide(Z.TWO);
  }

}
