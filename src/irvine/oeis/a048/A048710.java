package irvine.oeis.a048;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.WolframAutomata;

/**
 * A048710 Family 1 "Rule 90 x Rule 150 Array" read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A048710 extends MemoryFunction2<Long, Z> implements Sequence {

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n == 0) {
      if (m == 0) {
        return Z.ONE;
      }
      return WolframAutomata.step(90, get(n, m - 1));
    }
    return WolframAutomata.step(150, get(n - 1, m));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mM, mN - mM);
  }
}
