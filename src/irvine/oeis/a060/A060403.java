package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.English;

/**
 * A060393.
 * @author Sean A. Irvine
 */
public class A060403 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.add(English.SINGLETON.toRawText(mA.intValueExact()).length());
    return mA;
  }
}

