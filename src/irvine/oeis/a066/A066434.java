package irvine.oeis.a066;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066434 a(n) = floor(Pi^n mod n^Pi).
 * @author Sean A. Irvine
 */
public class A066434 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final CR n = CR.valueOf(++mN);
    final CR a = CR.PI.pow(mN);
    final CR b = n.pow(CR.PI);
    return a.mod(b).floor();
  }
}
