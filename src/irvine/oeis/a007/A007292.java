package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.Hungarian;

/**
 * A007292 Number of letters in <code>n</code> (in Hungarian).
 * @author Sean A. Irvine
 */
public class A007292 implements Sequence {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = -1;

  @Override
  public Z next() {
    final String hungarian = Hungarian.SINGLETON.toText(++mN);
    final int length = hungarian.replace("gy", "X").replace("ny", "X").replace("sz", "X").length();
    if (mVerbose) {
      System.out.println(mN + " " + hungarian + " (" + length + ")");
    }
    return Z.valueOf(length);
  }
}
