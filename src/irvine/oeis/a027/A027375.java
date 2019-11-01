package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a000.A000740;

/**
 * A027375 Number of aperiodic binary strings of length n; also number of binary sequences with primitive period <code>n</code>.
 * @author Sean A. Irvine
 */
public class A027375 extends A000740 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ZERO;
    }
    return super.next().multiply2();
  }
}
