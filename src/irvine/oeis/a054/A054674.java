package irvine.oeis.a054;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A054674 Nearest integer to n^cos(n).
 * @author Sean A. Irvine
 */
public class A054674 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final CR n = CR.valueOf(++mN);
    return n.pow(n.cos()).round();
  }
}
