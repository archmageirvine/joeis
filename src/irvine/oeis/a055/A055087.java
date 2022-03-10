package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055087 Integers 0..n then 0..n then 0..n+1 then 0..n+1 etc.
 * @author Sean A. Irvine
 */
public class A055087 implements Sequence {

  private long mN = -1;
  private long mM = 0;
  private boolean mFirst = false;

  @Override
  public Z next() {
    if (++mM > mN) {
      if (mFirst) {
        mFirst = false;
      } else {
        mFirst = true;
        ++mN;
      }
      mM = 0;
    }
    return Z.valueOf(mM);
  }
}
