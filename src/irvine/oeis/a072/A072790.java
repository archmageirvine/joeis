package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a014.A014486;

/**
 * A072790 Maximum position in A072789 where the value n occurs.
 * @author Sean A. Irvine
 */
public class A072790 extends A014486 {

  private final DirectSequence mA = DirectSequence.create(0, new A072787());
  private Z mTree = super.next();
  private int mN = -2;
  private int mM = 0;

  @Override
  public Z next() {
    mN += 2;
    Z max = Z.ZERO;
    while (Functions.DIGIT_LENGTH.i(2, mTree.add(1)) <= mN) {
      final Z t = mA.a(mM);
      if (t.compareTo(max) > 0) {
        max = t;
      }
      ++mM;
      mTree = super.next();
    }
    return max;
  }
}
