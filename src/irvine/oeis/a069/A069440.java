package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001333;

/**
 * A069440 Half the number of n X 2 binary arrays with no path of adjacent 1's or adjacent 0's from top row to bottom row.
 * @author Sean A. Irvine
 */
public class A069440 extends Sequence1 {

  private final Sequence mA = new A001333().skip(2);
  private long mN = 0;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(2 * ++mN - 1).subtract(mA.next()).add(1);
  }
}
