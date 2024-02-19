package irvine.oeis.a208;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000070;

/**
 * A208738 Number of multisets occurring as the peak heights multiset of a Dyck n-path.
 * @author Georg Fischer
 */
public class A208738 extends Sequence0 {

  private final Sequence mA000070 = new A000070();
  private long mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.TWO.pow(Z.valueOf(mN)).subtract(mA000070.next());
  }
}
