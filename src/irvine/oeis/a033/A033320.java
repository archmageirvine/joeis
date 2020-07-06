package irvine.oeis.a033;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033320 <code>a(n) = floor( sqrt(2) * (3/2)^n )</code>.
 * @author Sean A. Irvine
 */
public class A033320 implements Sequence {

  private CR C = CR.valueOf(new Q(3, 2));
  private int mN = -1;

  @Override
  public Z next() {
    return CR.SQRT2.multiply(ComputableReals.SINGLETON.pow(C, ++mN)).floor();
  }
}

