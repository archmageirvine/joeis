package irvine.oeis.a132;

import irvine.math.z.Z;
import irvine.oeis.recur.GeneralRecurrence;

/**
 * A132971 a(2*n) = a(n), a(4*n+1) = -a(n), a(4*n+3) = 0, with a(0) = 1.
 * @author Georg Fischer
 */
public class A132971 extends GeneralRecurrence {

  /** Construct the sequence. */
  public A132971() {
    super(0, 1);
  }

  @Override
  protected void initialize() {
    /* 4*k+0 */
    mLambda.add(n -> a(2 * n));
    /* 4*k+1 */
    mLambda.add(n -> a(n).negate());
    /* 4*k+2 */
    mLambda.add(n -> a(2 * n + 1));
    /* 4*k+3 */
    mLambda.add(n -> Z.ZERO);
  }
}
