package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.IrishGaelic;

/**
 * A001368 Number of letters in n (in Irish Gaelic).
 * @author Sean A. Irvine
 */
public class A001368 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    final String s = IrishGaelic.toIrishGaelic(++mN);
    //System.err.println(mN + " " + s.replace("\u00E1", "a").replace("\u00F3", "o").replace("\u00ED", "i").replace("\u00E9", "e").replace("\u00FA", "u"));
    return Z.valueOf(s.replace(" ", "").replace("h", "").length());
  }
}
