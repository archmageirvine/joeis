package irvine.oeis.a076;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A076829 a(n) = floor(log(log(n^n^n))).
 * @author Sean A. Irvine
 */
public class A076829 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    final CR z = CR.valueOf(++mN);
    final CR logz = z.log();
    return logz.multiply(z).add(logz.log()).floor();
  }
}
