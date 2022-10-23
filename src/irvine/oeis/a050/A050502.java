package irvine.oeis.a050;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050502 a(n) = ceiling(n*log(n)).
 * @author Sean A. Irvine
 */
public class A050502 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final CR n = CR.valueOf(++mN);
    return n.multiply(n.log()).ceil();
  }
}
