package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004736 Triangle read by rows: row n lists the first n positive integers in decreasing order.
 * @author Sean A. Irvine
 */
public class A004736 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (--mM < 1) {
      ++mN;
      mM = mN;
    }
    return Z.valueOf(mM);
  }
}

