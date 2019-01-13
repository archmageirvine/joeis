package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007376.
 * @author Sean A. Irvine
 */
public class A007376 implements Sequence {

  private long mN = 0;
  private String mS = "";
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mS.length()) {
      mS = String.valueOf(++mN);
      mM = 0;
    }
    return Z.valueOf(mS.charAt(mM) - '0');
  }
}
