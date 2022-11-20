package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.English;

/**
 * A060403 Each term is the previous term plus the number of letters in the previous number, as conventionally spelled out in American English.
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

