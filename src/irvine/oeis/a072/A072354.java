package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000045;

/**
 * A072354 a(n)-th Fibonacci number is the smallest Fibonacci number containing n digits.
 * @author Sean A. Irvine
 */
public class A072354 extends Sequence1 {

  private final Sequence mFibo = new A000045().skip();
  private Z mF = mFibo.next();
  private int mN = 0;
  private long mM = 1;

  @Override
  public Z next() {
    ++mN;
    while (Functions.DIGIT_LENGTH.i(mF) < mN) {
      mF = mFibo.next();
      ++mM;
    }
    return Z.valueOf(mM);
  }
}
