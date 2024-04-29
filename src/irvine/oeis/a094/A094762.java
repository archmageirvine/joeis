package irvine.oeis.a094;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A094762 a(n) = Bell(n+1) - 2^n + 1 + n, where Bell(i) is the i-th Bell number A000110(i).
 * @author Georg Fischer
 */
public class A094762 extends Sequence0 {

  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Functions.BELL.z(mN + 1).subtract(Z.ONE.shiftLeft(mN)).add(mN + 1);
  }
}
