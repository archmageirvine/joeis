package irvine.oeis.a124;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a018.A018782;

/**
 * A124980 Smallest strictly positive number decomposable in n different ways as a sum of two squares.
 * @author Sean A. Irvine
 */
public class A124980 extends Sequence1 {

  private int mN = 0;
  private final MemorySequence mA18782 = MemorySequence.cachedSequence(new A018782());

  @Override
  public Z next() {
    ++mN;
    return mA18782.a(2 * mN - 1).min(mA18782.a(2 * mN - 2));
  }
}
