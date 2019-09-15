package irvine.oeis.a026;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026034 <code>T(n,[ n/2 ])</code>, where T is defined in <code>A026022</code>.
 * @author Sean A. Irvine
 */
public class A026034 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, mN / 2).subtract(Binomial.binomial(mN, mN / 2 - 4));
  }
}

