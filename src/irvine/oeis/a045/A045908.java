package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002212;

/**
 * A045908 Number of catafusenes with C_{2v}(b) symmetry (see reference for precise definition).
 * @author Sean A. Irvine
 */
public class A045908 implements Sequence {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A002212());
  private int mN = -1;

  @Override
  public Z next() {
    Z t = mA.a(++mN + 1).subtract(mA.a(mN));
    if ((mN & 1) == 0) {
      t = t.subtract(mA.a(mN / 2));
    }
    return t.divide2();
  }
}
