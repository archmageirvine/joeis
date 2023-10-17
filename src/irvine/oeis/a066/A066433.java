package irvine.oeis.a066;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066433 a(n) = floor(e^n mod n^e).
 * @author Sean A. Irvine
 */
public class A066433 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final CR n = CR.valueOf(++mN);
    final CR a = n.exp();
    final CR b = n.pow(CR.E);
    return a.mod(b).floor();
  }
}
