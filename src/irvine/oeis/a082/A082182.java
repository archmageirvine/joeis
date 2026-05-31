package irvine.oeis.a082;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A082182 Numbers k such that (5^k - 2^k)/3 is prime.
 * @author Georg Fischer
 */
public class A082182 extends HolonomicRecurrence {

  private long mK;
  private Z mA; // first base
  private Z mB; // second base
  private long mSignB; // signum(mB)
  private boolean mInit2; // whether there is a leading term 2

  /** Construct the sequence. */
  public A082182() {
    this(1, 5, -2, 3);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param a first base
   * @param b second base
   * @param c = a + b, for consistency check
   */
  public A082182(final int offset, final long a, final long b, final long c) {
    super(offset);
    mK = -1;
    mA = Z.valueOf(a);
    mSignB = b < 0 ? -1 : 1;
    mB = Z.valueOf(b).abs();
    if (c != a + b) {
      throw new IllegalArgumentException("a + b != c");
    }
    final long num = a * a + b * b * mSignB;
    mInit2 = num % c == 0 && Predicates.PRIME.is(num / c);
    mInitTerms = new Z[] {Z.ONE, mA.pow(3).add(mB.pow(3).multiply(mSignB)).divide(a + b)};
    mPolyList.add(new Z[] {Z.ZERO});
    mPolyList.add(new Z[] {mA.square().multiply(mB.square())});
    mPolyList.add(new Z[] {mA.square().add(mB.square()).negate()});
    mPolyList.add(new Z[] {Z.ONE});
    initialize();
    // System.err.println("holos \"" + getPolyString() + "\" \"" + getInitString() + "\"");
  }

  @Override
  public Z next() {
    while (true) {
      final Z term = super.next();
      mK += 2;
      if (mInit2) {
        mInit2 = false;
        return Z.TWO;
      }
      if (!(mK > 3 && mK % 3 == 0 || mK > 5 && mK % 5 == 0 || mK > 7 && mK % 7 == 0) && term.isProbablePrime()) {
        return Z.valueOf(mK);
      }
    }
  }
}
