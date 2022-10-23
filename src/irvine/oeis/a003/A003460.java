package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003460 Octal formula for dragon curve of order n.
 * @author Sean A. Irvine
 */
public class A003460 extends Sequence1 {

  private String mDragon = "";

  @Override
  public Z next() {
    final StringBuilder sb = new StringBuilder(mDragon);
    sb.append('1');
    if (!mDragon.isEmpty()) {
      final int flipPos = mDragon.length() / 2;
      final char mid = mDragon.charAt(flipPos);
      sb.append(mDragon, 0, flipPos);
      sb.append(mid == '0' ? '1' : '0');
      sb.append(mDragon.substring(flipPos + 1));
    }
    mDragon = sb.toString();
    return new Z(new Z(mDragon, 2).toString(8));
  }
}
