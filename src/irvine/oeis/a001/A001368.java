package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.IrishGaelic;

/**
 * A001368 Number of letters in <code>n</code> (in Irish Gaelic).
 * @author Sean A. Irvine
 */
public class A001368 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    final String s = IrishGaelic.toIrishGaelic(++mN);
    return Z.valueOf(s.replace(" ", "").replace("h", "").length());
  }
}
