package irvine.oeis.a069;

import java.util.TreeMap;

import irvine.lisp.SExpression;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a057.A057501;
import irvine.oeis.a061.A061855;

/**
 * A069743.
 * @author Sean A. Irvine
 */
public class A069766 extends Sequence0 {

  private final Sequence mA = new A061855();
  private final Sequence mB = new A061855();
  private final TreeMap<Z, Long> mM = new TreeMap<>();
  private long mK = -1;

  @Override
  public Z next() {
    SExpression s = SExpression.binexp2pars(mA.next());
    final int end = s.countParens() / 2;
    for (int k = 0; k < end; ++k) {
      s = A057501.rotateHandshakesP(s);
    }
    final Z r = s.toZ();
    while (mM.get(r) == null) {
      mM.put(mB.next(), ++mK);
    }
    return Z.valueOf(mM.remove(r));
  }
}
