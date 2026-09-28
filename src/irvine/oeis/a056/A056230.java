package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a052.A052474;

/**
 * A056230 Construct a difference array so that (1) the first row begins with 1, (2) every row is monotonically increasing, (3) no number appears more than once, and (4) the smallest number not yet used begins a new row. The sequence gives the array read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A056230 extends A052474 {

  private int mN = 0;

  @Override
  public Z next() {
    if (--mN < 0) {
      super.next(); // Force calculation of next row
      mN = mA.length() - 1;
    }
    return Z.valueOf(mA.get(mN));
  }
}

