package irvine.oeis.a011;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011853 <code>[ binomial(n,7)/7 ]</code>.
 * @author Sean A. Irvine
 */
public class A011853 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 7).divide(7);
  }
}
