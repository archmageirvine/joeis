package irvine.oeis.a054;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054675 Nearest integer to tan(n)^n.
 * @author Sean A. Irvine
 */
public class A054675 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final CR n = CR.valueOf(mN);
    return ComputableReals.SINGLETON.tan(n).pow(n).round();
  }
}
