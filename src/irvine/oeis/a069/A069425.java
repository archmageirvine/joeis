package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A069425 Number of n X 5 binary arrays with a path of adjacent 1's and no path of adjacent 0's from top row to bottom row.
 * @author Sean A. Irvine
 */
public class A069425 extends Sequence1 {

  private final Sequence mA = new A069380();
  private final Sequence mB = new A069405();

  @Override
  public Z next() {
    return mA.next().subtract(mB.next().multiply2());
  }
}
