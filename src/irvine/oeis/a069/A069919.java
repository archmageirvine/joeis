package irvine.oeis.a069;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A069919 Squares which repeat with at least two full periods when written in base 10.
 * @author Sean A. Irvine
 */
public class A069919 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final TreeSet<Z> mA = new TreeSet<>();
  private final Z mBase;
  private int mNumDigits = 0;

  protected A069919(final int base) {
    mBase = Z.valueOf(base);
  }

  /** Construct the sequence. */
  public A069919() {
    this(10);
  }

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(mBase.pow(2L * mNumDigits)) > 0) {
      ++mNumDigits;
      if (mVerbose) {
        StringUtils.message("Starting search for period length " + mNumDigits);
      }
      final Z u = mBase.pow(mNumDigits);
      final Z v = mBase.pow(mNumDigits - 1);
      for (Z t = v; t.compareTo(u) < 0; t = t.add(1)) {
        // Compute z = tttt (four full periods of t)
        // There is no need to consider more repeats because a repeat tttt is equivalent to (tt)(tt)
        Z z = t.multiply(u).add(t).multiply(u).add(t).multiply(u).add(t);
        // Repeatedly chop of the last digit and check for a square
        for (int k = 0; k < 2 * mNumDigits; ++k) {
          z = z.divide(mBase);
          if (z.isSquare() && mA.add(z) && mVerbose) {
            StringUtils.message("Found solution: " + z);
          }
        }
      }
    }
    return mA.pollFirst();
  }
}
