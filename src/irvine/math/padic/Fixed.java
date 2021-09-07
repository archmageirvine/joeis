package irvine.math.padic;

/**
 * Fixed point of a p-adic, namely <code>1/(1-p)</code>.
 * @author Sean A. Irvine
 */
public class Fixed extends AbstractPAdic {

  private final PAdic mA;

  private Fixed(final PAdic a) {
    mA = a;
  }

  @Override
  public long p() {
    return mA.p();
  }

  @Override
  public long get(final int n) {
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    return n == 0 ? 1 : mA.get(n - 1);
  }
}
