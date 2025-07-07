package irvine.oeis.a078;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A078609 Least positive integer x such that 2*x^n&gt;(x+3)^n.
 * @author Sean A. Irvine
 */
public class A078609 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    return CR.THREE.divide(CR.TWO.pow(new Q(1, ++mN)).subtract(1)).ceil();
  }
}

