package irvine.oeis.a058;

import irvine.math.z.Z;

/**
 * A058841 From Renyi's "beta expansion of 1 in base 3/2": sequence gives lengths of runs of 0's in A058840.
 * @author Sean A. Irvine
 */
public class A058841 extends A058840 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ZERO;
    }
    while (!super.next().isZero()) {
      // do nothing
    }
    long cnt = 1;
    while (super.next().isZero()) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
