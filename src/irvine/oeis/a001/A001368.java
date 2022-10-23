package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.string.IrishGaelic;

/**
 * A001368 Number of letters in n (in Irish Gaelic).
 * @author Sean A. Irvine
 */
public class A001368 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    final String s = IrishGaelic.SINGLETON.toText(++mN);
    return Z.valueOf(s.replace(" ", "").replace("h", "").length());
  }
}
