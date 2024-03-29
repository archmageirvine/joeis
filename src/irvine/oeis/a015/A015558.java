package irvine.oeis.a015;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A015558 Nearest integer to (n/e)^n.
 * @author Sean A. Irvine
 */
public class A015558 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return ComputableReals.SINGLETON.pow(CR.valueOf(++mN).divide(CR.E), mN).round();
  }
}
