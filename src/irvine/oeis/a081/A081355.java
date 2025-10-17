package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.string.EditDist;

/**
 * A081355 Levenshtein distance between n and n^2 in decimal representation.
 * @author Sean A. Irvine
 */
public class A081355 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final String s = String.valueOf(++mN);
    final String t = Z.valueOf(mN).square().toString();
    return Z.valueOf(EditDist.editDistance(s, t));
  }
}
