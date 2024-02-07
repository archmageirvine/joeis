package irvine.oeis.a068;

/**
 * A068271 1/4 the number of colorings of an n X n rhombic hexagonal array with 4 colors.
 * @author Sean A. Irvine
 */
public class A068271 extends A068254 {

  protected A068271(final int offset, final int bits) {
    super(offset, bits);
  }

  /** Construct the sequence. */
  public A068271() {
    this(1, 2);
  }

  @Override
  protected boolean isLegal(final int n, final long p1in, final long p2in) {
    long p2 = p2in;
    long p1 = p1in;
    for (int k = 0; k < n; ++k) {
      if ((p1 & mMask) == (p2 & mMask)) {
        return false;
      }
      p1 >>>= mBits;
      p2 >>>= mBits;
    }
    p2 = p2in;
    p1 = p1in >> mBits;
    for (int k = 1; k < n; ++k) {
      if ((p1 & mMask) == (p2 & mMask)) {
        return false;
      }
      p1 >>>= mBits;
      p2 >>>= mBits;
    }
    return true;
  }
}
