package irvine.oeis.a115;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.EditDist;

/**
 * A115777 Levenshtein distance between n considered as a decimal string and n considered as a binary string.
 * @author Sean A. Irvine
 */
public class A115777 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final String s = Long.toString(++mN);
    final String t = Long.toBinaryString(mN);
    return Z.valueOf(EditDist.editDistance(s, t));
  }
}
