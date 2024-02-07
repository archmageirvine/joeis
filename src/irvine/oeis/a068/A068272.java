package irvine.oeis.a068;

/**
 * A068272 1/5 the number of colorings of an n X n rhombic hexagonal array with 5 colors.
 * @author Sean A. Irvine
 */
public class A068272 extends A068255 {

  protected A068272(final int bits) {
    super(bits);
  }

  /** Construct the sequence. */
  public A068272() {
    this(5);
  }

  @Override
  protected boolean isLegal(final int n, final long p1in, final long p2in) {
    long p2 = p2in;
    long p1 = p1in;
    for (int k = 0; k < n; ++k) {
      if (p1 % mColors == p2 % mColors) {
        return false;
      }
      p1 /= mColors;
      p2 /= mColors;
    }
    // Check with moved left
    p2 = p2in;
    p1 = p1in / mColors;
    for (int k = 1; k < n; ++k) {
      if (p1 % mColors == p2 % mColors) {
        return false;
      }
      p1 /= mColors;
      p2 /= mColors;
    }
    return true;
  }
}
