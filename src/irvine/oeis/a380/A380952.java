package irvine.oeis.a380;
// manually 2026-09-29/ratos at 2026-09-29

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.recur.RationalRecurrence;

/**
 * A380952 a(n) = 2^(2*n - HammingWeight(n)) * [x^n] ((x - 1)^(-2) - (1 - x)^(-3/2)).
 * @author Georg Fischer
 */
public class A380952 extends RationalRecurrence {

  private long mN;

  /** Construct the sequence. */
  public A380952() {
    super(0, "[[0],[0,-1,2],[1,3,-4],[0,-2,2]]", "0,1/2,9/8,29/16", 0, 0);
    mN = -1;
  }

  @Override
  public Z next() {
    ++mN;
    return super.nextQ().multiply(Z.TWO.pow(2 * mN - Functions.DIGIT_SUM.l(2, mN))).num();
  }
}
