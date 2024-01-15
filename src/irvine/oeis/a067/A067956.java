package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067956 Number of nodes in virtual, "optimal", chordal graphs of diameter 4 and degree n+1.
 * @author Sean A. Irvine
 */
public class A067956 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final long t = (mN + 1) / 2;
    final Z u = Z.valueOf(2 * t).multiply(t + 1).multiply(t * t + t + 4).divide(3).add(1);
    return (mN & 1) == 1 ? u : u.add(Z.valueOf(2 * t + 1).multiply(2 * t * t + 2 * t + 3).divide(3));
  }
}
