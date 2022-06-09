package irvine.oeis.a217;
// manually cordrec at 2022-06-09 10:29

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A217592 Integers that are cut in half by cycling all the decimal digits one place to the left.
 * <code>a(n+9)=10^18*a(n) + a(n)%10^18</code>
 * @author Georg Fischer
 */
public class A217592 extends ConstantOrderRecurrence {

  private final Z mTEN18 = Z.TEN.pow(18);

  /** Construct the sequence */
  public A217592() {
    super(0, 9, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
    // 0, 105263157894736842, 210526315789473684,...
    final Z a1 = new Z("105263157894736842");
    for (int j = 1; j <= 9; ++j) {
      mBuffer[j] = a1.multiply(j);
    }
  }

  @Override
  protected Z compute(final int n) {
    return a(n).mod(mTEN18).add(a(n).multiply(mTEN18));
  }
}
