package irvine.oeis.a393;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a036.A036040;
import irvine.oeis.a036.A036043;

/**
 * A393092 allocated for Mohammad Alminawi.
 * @author Sean A. Irvine
 */
public class A393092 extends Sequence1 {

  private final DirectSequence mA = DirectSequence.create(new A036043());
  private final DirectSequence mB = DirectSequence.create(new A036040());
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    final long t = mN * (mN - 1) / 2 + mM;
    final Z a = Functions.FACTORIAL.z(mA.a(t).subtract(1)).add(1).divide2();
    final Z b = mB.a(t);
    return a.multiply(b);
  }
}
