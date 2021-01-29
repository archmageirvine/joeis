package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A038724 Each term describes the ordinal number of its position in the sequence, by a summation of the numerals in that ordinal number and then by the differences between each contiguous pair of the numerals in the order in which they appear.
 * @author Sean A. Irvine
 */
public class A038724 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    final StringBuilder sb = new StringBuilder();
    sb.append(ZUtils.digitSum(++mN));
    final String s = String.valueOf(mN);
    for (int k = 1; k < s.length(); ++k) {
      sb.append(Math.abs(s.charAt(k) - s.charAt(k - 1)));
    }
    return new Z(sb);
  }
}
