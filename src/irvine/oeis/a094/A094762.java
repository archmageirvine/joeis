package irvine.oeis.a094;

import irvine.math.z.BellNumbers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A094762 a(n) = Bell(n+1) - 2^n + 1 + n, where Bell(i) is the i-th Bell number A000110(i).
 * @author Georg Fischer
 */
public class A094762 implements Sequence {

  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return BellNumbers.bell(mN + 1).subtract(Z.ONE.shiftLeft(mN)).add(mN + 1);
  }
}
