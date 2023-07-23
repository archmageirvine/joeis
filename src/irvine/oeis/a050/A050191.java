package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.a011.A011796;

/**
 * A050191 T(n,6), array T as in A050186; a count of aperiodic binary words.
 * @author Sean A. Irvine
 */
public class A050191 extends A011796 {

  {
    setOffset(6);
  }

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ZERO;
    }
    return super.next().multiply(mN);
  }
}
