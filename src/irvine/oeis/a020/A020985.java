package irvine.oeis.a020;

import java.util.ArrayList;
import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A020985 The Rudin-Shapiro or Golay-Rudin-Shapiro sequence (coefficients of the Shapiro polynomials).
 * @author Sean A. Irvine
 */
public class A020985 extends AbstractSequence {

  /** Construct the sequence. */
  public A020985() {
    super(0);
  }

  protected long mN = -1;
  protected final LongDynamicBooleanArray mA = new LongDynamicBooleanArray();

  @Override
  public Z next() {
    final boolean a;
    if (++mN == 0) {
      a = true;
    } else if ((mN & 3) == 3) {
      a = !mA.isSet(mN / 2);
    } else {
      a = mA.isSet(mN / 2);
    }
    if (a) {
      mA.set(mN);
      return Z.ONE;
    } else {
      return Z.NEG_ONE;
    }
  }

  /**
   * This main actually does computation for A005943.
   * @param args limit in bits for number of terms in A020985, term limit for A005943
   */
  public static void main(final String[] args) {
    final A020985 seq = new A020985();
    final int termLimit = Integer.parseInt(args[1]);
    if (termLimit > 63) {
      throw new UnsupportedOperationException();
    }
    final ArrayList<HashSet<Long>> seen = new ArrayList<>();
    for (int k = 0; k < termLimit; ++k) {
      seen.add(new HashSet<>());
    }
    final long steps = 1L << Integer.parseInt(args[0]);
    for (long u = 0, v = 0; u < steps; ++u) {
      v <<= 1;
      if (seq.next().signum() > 0) {
        v |= 1;
      }
      long m = 1;
      for (int k = 0; k < Math.min(u, termLimit); ++k, m <<= 1, m |= 1) {
        seen.get(k).add(v & m);
      }
    }
    for (int k = 0; k < termLimit; ++k) {
      System.out.println(k + " " + seen.get(k).size());
    }
  }
}
