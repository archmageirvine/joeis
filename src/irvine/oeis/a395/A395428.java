package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a006.A006667;
import irvine.util.array.DynamicLongArray;

/**
 * A395428 Square matrix where the n-th row lists the odd numbers which take n steps to reach 1 under the reduced Collatz map R: x -&gt; A000265(3x+1), read by falling antidiagonals.
 * @author Sean A. Irvine
 */
public class A395428 extends Sequence1 {

  private final DirectSequence mC = new A006667();
  private final DynamicLongArray mA = new DynamicLongArray();
  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
      mA.set(mN, 1L);
    }
    long t = mA.get(mM);
    while (true) {
      t += 2;
      if (mC.a(t).equals(mM)) {
        mA.set(mM, t);
        return Z.valueOf(t);
      }
    }
  }
}
