package irvine.oeis.a296;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a023.A023645;

/**
 * A296966 Sum of all the parts in the partitions of n into two distinct parts such that the smaller part divides the larger.
 * @author Georg Fischer
 */
public class A296966 extends Sequence1 {

  final Sequence mA023645 = new A023645();
  protected long mN;
  /** Construct the sequence. */
  public A296966() {
    mN = 0;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).multiply(mA023645.next());
  }

}
