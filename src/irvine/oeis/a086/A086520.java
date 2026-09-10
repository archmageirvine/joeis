package irvine.oeis.a086;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A086522.
 * @author Sean A. Irvine
 */
public class A086520 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final CR s = CR.valueOf(++mN).sqrt();
    return s.add(mN).divide(2).ceil().subtract(CR.valueOf(mN).subtract(s).divide(2).floor().add(1)).max(Z.ZERO);
  }
}

