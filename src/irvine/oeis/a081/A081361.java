package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.English;

/**
 * A081349.
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

