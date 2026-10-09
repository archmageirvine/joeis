package irvine.oeis.a102;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A102548 Number of positive integers &lt;= n that are expressible in the form u^2+v^2, with u and v integers.
 * @author Sean A. Irvine
 */
public class A102548 extends Sequence1 {

  private long mN = 0;
  private Z mS = Z.ZERO;

  @Override
  public Z next() {
    final FactorSequence fs= Jaguar.factor(++mN);
    boolean ok = true;
    for (final Z p : fs.toZArray()) {
      if (p.mod(4) == 3 && (fs.getExponent(p) & 1) == 1) {
        ok = false;
        break;
      }
    }
    if (ok) {
      mS = mS.add(1);
    }
    return mS;
  }
}
