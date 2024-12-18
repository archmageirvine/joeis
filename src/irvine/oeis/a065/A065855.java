package irvine.oeis.a065;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000720;

/**
 * A065855 Number of composites &lt;= n.
 * @author Georg Fischer
 */
public class A065855 extends Sequence1 {

  private final Sequence mA000720 = new A000720();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).subtract(mA000720.next()).subtract(Z.ONE);
  }

}
