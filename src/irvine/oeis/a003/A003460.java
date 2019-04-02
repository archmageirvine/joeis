package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003460 Octal formula for dragon curve of order n.
 * @author Sean A. Irvine
 */
public class A003460 implements Sequence {

  private String mDragon = "";

  @Override
  public Z next() {
    final StringBuilder sb = new StringBuilder(mDragon);
    sb.append('1');
    if (mDragon.length() > 0) {
      final int flipPos = mDragon.length() / 2;
      final char mid = mDragon.charAt(flipPos);
      sb.append(mDragon.substring(0, flipPos));
      sb.append(mid == '0' ? '1' : '0');
      sb.append(mDragon.substring(flipPos + 1));
    }
    mDragon = sb.toString();
    return new Z(new Z(mDragon, 2).toString(8));
  }
}
