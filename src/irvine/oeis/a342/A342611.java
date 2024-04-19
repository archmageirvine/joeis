package irvine.oeis.a342;

import irvine.oeis.recur.GeneralRecurrence;

/**
 * A342611 a(0) = 0, a(1) = 1; a(2*n) = 7*a(n), a(2*n+1) = a(n) + a(n+1).
 * @author Georg Fischer
 */
public class A342611 extends GeneralRecurrence {

  private final int mParm;

  /** Construct the sequence. */
  public A342611() {
    this(0, 0, 1, 7);
  }

  /**
   * Generic constructor with parameters
   * @param offset index of first term
   * @param a0 a(0)
   * @param a1 a(1)
   * @param parm factor of a(n)
   */
  public A342611(final int offset, final int a0, final int a1, final int parm) {
    super(offset, a0, a1);
    mParm = parm;
  }

  protected void initialize() {
    mLambda.add(n -> a(n).multiply(mParm));
    mLambda.add(n -> a(n).add(a(n + 1)));
  }
}
