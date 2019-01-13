package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.cr.CR;
import irvine.math.cr.Convergents;

/**
 * A002486.
 * @author Sean A. Irvine
 */
public class A002486 implements Sequence {

  private final Convergents mC = new Convergents(CR.PI);
  private long mN = 2;

  @Override
  public Z next() {
    if (mN > 0) {
      return Z.valueOf(--mN);
    }
    return mC.next().den();
  }
}
