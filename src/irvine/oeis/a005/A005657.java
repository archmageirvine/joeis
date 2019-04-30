package irvine.oeis.a005;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005657 <code>a(n) = floor( tan(n)^2 )</code>.
 * @author Sean A. Irvine
 */
public class A005657 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    final CR tan = ComputableReals.SINGLETON.tan(CR.valueOf(++mN));
    return tan.multiply(tan).floor(32);
  }
}

