package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A069443 Half the number of n X 5 binary arrays with no path of adjacent 1's or adjacent 0's from top row to bottom row.
 * @author Sean A. Irvine
 */
public class A069443 extends Sequence1 {

  private final Sequence mA = new A069380();
  private final Sequence mB = new A069405();
  private long mN = 0;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(5 * ++mN - 1).subtract(mA.next()).add(mB.next());
  }
}
