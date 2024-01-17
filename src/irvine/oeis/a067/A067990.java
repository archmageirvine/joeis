package irvine.oeis.a067;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000204;
import irvine.oeis.memory.MemorySequence;

/**
 * A067990 Triangle A067979 with rows read backwards.
 * @author Sean A. Irvine
 */
public class A067990 extends Sequence0 {

  private final MemorySequence mL = MemorySequence.cachedSequence(new A000204());
  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (--mM < 0) {
      mM = ++mN;
    }
    return Integers.SINGLETON.sum(0, mM, k -> mL.a(k).multiply(mL.a(mN - k)));
  }
}

