package irvine.oeis.a308;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a026.A026811;

/**
 * A308822 Sum of all the parts in the partitions of n into 5 parts.
 * @author Georg Fischer
 */
public class A308822 extends Sequence0 {

  final Sequence mA026811 = new A026811();
  protected long mN;
  /** Construct the sequence. */
  public A308822() {
    mN = -1;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).multiply(mA026811.next());
  }

}
