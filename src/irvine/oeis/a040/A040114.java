package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A040114 List of absolute values of differences between digits of 10, 11, 12, ..., listed digit by digit.
 * @author Sean A. Irvine
 */
public class A040114 implements Sequence {

  private long mN = 9;
  private String mS = "";
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mS.length()) {
      mS = String.valueOf(++mN);
      mM = 1;
    }
    return Z.valueOf(Math.abs(mS.charAt(mM) - mS.charAt(mM - 1)));
  }
}
