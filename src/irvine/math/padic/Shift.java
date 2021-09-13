package irvine.math.padic;

/**
 * Shift a p-adic by one position.
 * @author Sean A. Irvine
 */
public class Shift extends AbstractPAdic {

  private final PAdic mA;

  /**
   * Shift.
   * @param number.
   */
  public Shift(final PAdic n) {
    mA = n;
  }

  @Override
  public long p() {
    return mA.p();
  }

  @Override
  public long get(final int n) {
    return mA.get(n + 1);
  }
}
