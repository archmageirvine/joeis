package irvine.math.padic;

/**
 * Shift a p-adic by one position.
 * @author Sean A. Irvine
 */
public class Shift extends AbstractPAdic {

  /**
   * Shift.
   * @param number number to shift
   * @param offset places to shift
   */
  static PAdic shift(final PAdic n, final int offset) {
    if (n instanceof Shift) {
      final Shift s = (Shift) n;
      return new Shift(s.mA, s.mOffset + offset);
    }
    return new Shift(n, offset);
  }

  private final PAdic mA;
  private final int mOffset;

  private Shift(final PAdic n, final int offset) {
    mA = n;
    mOffset = offset;
  }

  @Override
  public long p() {
    return mA.p();
  }

  @Override
  public long get(final int n) {
    return mA.get(n + mOffset);
  }
}
