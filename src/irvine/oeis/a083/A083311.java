package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.util.string.EditDist;

/**
 * A083311 Minimal number of edit-steps (insert, delete, substitute) to obtain in decimal representation the least number greater n that contains all digits of n (A083310).
 * @author Sean A. Irvine
 */
public class A083311 extends A083310 {

  private long mN = -1;

  @Override
  public Z next() {
    final String s = String.valueOf(++mN);
    final String t = super.next().toString();
    return Z.valueOf(EditDist.editDistance(s, t));
  }
}
