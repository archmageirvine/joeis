package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.EditDist;

/**
 * A081230 a(n) is the Levenshtein distance between n and n^n (where each is treated as a string).
 * @author Sean A. Irvine
 */
public class A081230 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final String s = String.valueOf(++mN);
    final String t = Z.valueOf(mN).pow(mN).toString();
    return Z.valueOf(EditDist.editDistance(s, t));
  }
}
