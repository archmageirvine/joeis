package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.a003.A003586;

/**
 * A022328 Exponent of <code>2</code> (value of <code>i)</code> in n-th number of form <code>2^i*3^j</code> (see <code>A003586)</code>.
 * @author Sean A. Irvine
 */
public class A022328 extends A003586 {

  @Override
  public Z next() {
    final Z t = super.next();
    t.makeOdd();
    return Z.valueOf(t.auxiliary());
  }
}
