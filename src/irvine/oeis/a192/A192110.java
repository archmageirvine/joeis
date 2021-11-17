package irvine.oeis.a192;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A192110 Monotonic ordering of nonnegative differences 2^i - 3^j, for 40 &gt;= i &gt;= 0, j &gt;= 0.
 * @author Georg Fischer
 */
public class A192110 implements Sequence {

  protected long mBasei;
  protected long mBasej;
  protected final TreeSet<Z> mSet;

  /** Construct the sequence. */
  public A192110() {
    this(2, 3);
  }

  /**
   * Generic constructor with parameters
   * @param basei base for exponent <code>i</code>
   * @param basej base for exponent <code>j</code>
   */
  public A192110(final long basei, final long basej) {
    mBasei = basei;
    mBasej = basej;
    mSet = new TreeSet<>();
    mSet.add(Z.ZERO); // a^0 - b^0 = 0 is always a member
    Z powi = Z.ONE;
    for (int i = 0; i <= 40; ++i) {
      int j = 0;
      Z powj = Z.ONE;
      boolean busy = true;
      while (busy) {
        final Z diff = powi.subtract(powj);
        // System.out.println("i=" + i + ": " + powi + ", j=" + j + ": " + powj + ", diff=" + diff);
        if (diff.signum() <= 0) {
          busy = false;
        } else {
          mSet.add(diff);
          powj = powj.multiply(basej);
        }
        ++j;
      }
      powi = powi.multiply(basei);
    }
  }

  @Override
  public Z next() {
    return mSet.pollFirst();
  }
}
