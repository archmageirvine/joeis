package irvine.oeis.a225;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a006.A006128;

/**
 * A225596 Sum of largest parts of all partitions of n plus n. Also, total number of parts in all partitions of n plus n.
 * @author Georg Fischer
 */
public class A225596 extends Sequence0 {

  final Sequence mA006128 = new A006128();
  protected long mN;
  /** Construct the sequence. */
  public A225596() {
    mN = -1;
  }
  
  @Override
  public Z next() {
    ++mN;
    return mA006128.next().add(Z.valueOf(mN));
  }

}
