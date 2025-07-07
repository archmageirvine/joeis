package irvine.oeis.a078;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A078607 Least positive integer x such that 2*x^n &gt; (x+1)^n.
 * @author Sean A. Irvine
 */
public class A078607 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : CR.ONE.subtract(CR.TWO.pow(new Q(1, mN)).inverse()).inverse().floor();
  }
}

