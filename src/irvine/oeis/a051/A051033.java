package irvine.oeis.a051;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051033 a(n) = binomial(n, floor(n/3)).
 * @author Sean A. Irvine
 */
public class A051033 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, mN / 3);
  }
}
