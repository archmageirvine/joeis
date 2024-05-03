package irvine.oeis.a069;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069516 Geometric mean of digits = 3 and digits are in nondecreasing order.
 * @author Sean A. Irvine
 */
public class A069516 extends Sequence1 {

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
    if (prev <= 3) {
      search(t10.add(3), d + 1, 3);
    }
    if (prev <= 9) {
      search(t10.add(9), d + 1, 9);
    }
  }

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      mTarget = Z.THREE.pow(++mDigits);
      search(Z.ZERO, 0, 1);
    }
    return mA.pollFirst();
  }
}
