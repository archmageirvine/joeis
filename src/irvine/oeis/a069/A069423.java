package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A069423 Number of n X 3 binary arrays with a path of adjacent 1's and no path of adjacent 0's from top row to bottom row.
 * @author Sean A. Irvine
 */
public class A069423 extends Sequence1 {

  private final Sequence mA = new A069378();
  private final Sequence mB = new A069403().skip();

  @Override
  public Z next() {
    return mA.next().subtract(mB.next().multiply2());
  }
}
