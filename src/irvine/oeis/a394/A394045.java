package irvine.oeis.a394;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a053.A053507;

/**
 * A394045 allocated for M\u00e9lika Tebni.
 * @author Sean A. Irvine
 */
public class A394045 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final Sequence s = new A053507();
    return Integers.SINGLETON.sum(1, ++mN, k -> Binomial.binomial(mN + 1, k + 1).multiply(s.next()));
  }
}
