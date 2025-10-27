package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.English;

/**
 * A081361 Triangle read by rows: T(n,1) = number of letters in English name for n, T(n,k+1) = number of letters in T(n,k), but stop if T(n,k+1) would equal T(n,k).
 * @author Sean A. Irvine
 */
public class A081361 extends Sequence1 {

  private int mN = 0;
  private int mM = 4;

  @Override
  public Z next() {
    final int len = English.SINGLETON.toRawText(mM).length();
    if (len == mM) {
      mM = English.SINGLETON.toRawText(++mN).length();
    } else {
      mM = len;
    }
    return Z.valueOf(mM);
  }
}

