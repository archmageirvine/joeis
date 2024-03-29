package irvine.oeis.a178;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000740;

/**
 * A178472 Number of compositions (ordered partitions) of n where the gcd of the part sizes is not 1.
 * @author Georg Fischer
 */
public class A178472 extends Sequence1 {

  final Sequence mA000740 = new A000740();
  protected long mN;
  /** Construct the sequence. */
  public A178472() {
    mN = 0;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.TWO.pow(Z.valueOf(mN).subtract(Z.ONE)).subtract(mA000740.next());
  }

}
