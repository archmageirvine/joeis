package irvine.oeis.a050;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050502 a(n) = ceiling(n*log(n)).
 * @author Sean A. Irvine
 */
public class A050502 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final CR n = CR.valueOf(++mN);
    return n.multiply(n.log()).ceil();
  }
}
