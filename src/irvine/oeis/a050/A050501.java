package irvine.oeis.a050;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A050501 a(n) = ceiling(n/log(n)).
 * @author Sean A. Irvine
 */
public class A050501 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    final CR n = CR.valueOf(++mN);
    return n.divide(n.log()).ceil();
  }
}
