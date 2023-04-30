package irvine.oeis.a063;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063510 a(1) = 1, a(n) = a(floor(square root(n))) + 1 for n &gt; 1.
 * @author Sean A. Irvine
 */
public class A063510 extends Sequence1 {

  private long mN = 0;

  private CR lg(final CR n) {
    return n.log().divide(CR.LOG2);
  }

  @Override
  public Z next() {
    return ++mN == 1 ? Z.ONE : lg(lg(CR.valueOf(mN))).floor().add(2);
  }
}
