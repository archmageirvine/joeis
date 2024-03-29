package irvine.oeis.a308;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a026.A026810;

/**
 * A308775 Sum of all the parts in the partitions of n into 4 parts.
 * @author Georg Fischer
 */
public class A308775 extends Sequence0 {

  final Sequence mA026810 = new A026810();
  protected long mN;
  /** Construct the sequence. */
  public A308775() {
    mN = -1;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).multiply(mA026810.next());
  }

}
