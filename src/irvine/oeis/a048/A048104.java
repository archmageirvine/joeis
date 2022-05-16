package irvine.oeis.a048;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048104 If n = Product p_i^e_i (e_i &gt;= 1) then for some i, p_i &gt; e_i and for some j, p_j &lt; e_j.
 * @author Sean A. Irvine
 */
public class A048104 implements Sequence {

  private long mN = 23;

  private boolean isOk(final FactorSequence fs) {
    boolean sawOver = false;
    boolean sawUnder = false;
    for (final Z p : fs.toZArray()) {
      final int pp = p.intValueExact();
      final int e = fs.getExponent(p);
      if (e > pp) {
        sawOver = true;
      }
      if (e < pp) {
        sawUnder = true;
      }
    }
    return sawOver && sawUnder;
  }

  @Override
  public Z next() {
    while (true) {
      if (isOk(Jaguar.factor(++mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
