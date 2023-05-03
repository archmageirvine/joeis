package irvine.oeis.a126;

import irvine.math.z.Z;
import irvine.oeis.recur.GeneralRecurrence;

/**
 * A126760 a(0) = 0, a(2n) = a(n), a(3n) = a(n), a(6n+1) = 2n + 1, a(6n+5) = 2n + 2.
 * @author Georg Fischer
 */
public class A126760 extends GeneralRecurrence {

  /** Construct the sequence. */
  public A126760() {
    super(0, 0);
  }

  @Override
  protected void initialize() {
    /* 6*k+0 */
    mLambda.add(n -> a(3 * n));
    /* 6*k+1 */
    mLambda.add(n -> Z.valueOf(2 * n + 1));
    /* 6*k+2 */
    mLambda.add(n -> a(3 * n + 1));
    /* 6*k+3 */
    mLambda.add(n -> a(2 * n + 1));
    /* 6*k+4 */
    mLambda.add(n -> a(3 * n + 2));
    /* 6*k+5 */
    mLambda.add(n -> Z.valueOf(2 * n + 2));
  }
}
