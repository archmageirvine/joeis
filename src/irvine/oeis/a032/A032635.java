package irvine.oeis.a032;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032635 a(n) = floor(n^2 / e).
 * @author Sean A. Irvine
 */
public class A032635 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return CR.valueOf(Z.valueOf(++mN).square()).divide(CR.E).floor();
  }
}
