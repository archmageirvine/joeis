package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;
import irvine.util.string.StringUtils;

/**
 * A057846 Sort the digits of n into alphabetical order (the "Obsessive Filer's Sequence").
 * @author Sean A. Irvine
 */
public class A057846 extends Sequence0 {

  private static final int[] ORDERING = {8, 5, 4, 9, 1, 7, 6, 3, 2, 0};
  private long mN = -1;

  @Override
  public Z next() {
    final int[] cnts = ZUtils.digitCounts(++mN);
    final StringBuilder sb = new StringBuilder();
    for (final int o : ORDERING) {
      sb.append(StringUtils.rep((char) ('0' + o), cnts[o]));
    }
    return new Z(sb);
  }
}
