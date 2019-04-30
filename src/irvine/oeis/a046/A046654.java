package irvine.oeis.a046;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046654 Nearest integer to <code>Sum_{k=1..n} log(k) = log(n!)</code>.
 * @author Sean A. Irvine
 */
public class A046654 implements Sequence {

  private CR mSum = CR.ZERO;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mSum = mSum.add(CR.valueOf(mN).log());
    }
    return mSum.add(CR.HALF).floor(32);
  }
}

