package irvine.oeis.a069;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069512 Geometric mean of digits = 2 and digits are in nondecreasing order.
 * @author Sean A. Irvine
 */
public class A069512 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private int mDigits = 0;
  private Z mTarget = null;

  private void search(final Z t, final int d, final int prev) {
    if (d == mDigits) {
      if (Functions.DIGIT_PRODUCT.z(t).equals(mTarget)) {
        mA.add(t);
      }
      return;
    }
    final Z t10 = t.multiply(10);
    if (prev <= 1) {
      search(t10.add(1), d + 1, 1);
    }
    if (prev <= 2) {
      search(t10.add(2), d + 1, 2);
    }
    if (prev <= 4) {
      search(t10.add(4), d + 1, 4);
    }
    if (prev <= 8) {
      search(t10.add(8), d + 1, 8);
    }
  }

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      mTarget = Z.ONE.shiftLeft(++mDigits);
      search(Z.ZERO, 0, 1);
    }
    return mA.pollFirst();
  }
}
