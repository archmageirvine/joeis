package irvine.math.padic;

/**
 * Negation of a p-adic
 * @author Sean A. Irvine
 */
public class Negate extends AbstractPAdic {

  private final PAdic mA;
  private int mFirstNonZero = -1;

  /**
   * Negation.
   * @param n number to negate.
   */
  public Negate(final PAdic n) {
    mA = n;
  }

  @Override
  public long p() {
    return mA.p();
  }

  @Override
  public long get(final int n) {
    final long t = mA.get(n);
    if (t != 0 && mFirstNonZero == -1) {
      while (mA.get(++mFirstNonZero) == 0) {
        // do nothing
      }
    }
    return p() - t - (n == mFirstNonZero ? 0 : 1);
  }
}
