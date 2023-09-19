package irvine.oeis.a138;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.AbstractSequence;

/**
 * A138484 Say what you see in previous term, from the right, reporting total number for each digit encountered. Initial term is 0.
 * @author Georg Fischer
 */
public class A138484 extends AbstractSequence {

  private Z mA;

  /** Construct the sequence. */
  public A138484() {
    this(0, 0);
  }

  /**
   * Generic constructor with parameters
   * @param offset index of first term
   * @param start start with this digit
   */
  public A138484(final int offset, final int start) {
    super(offset);
    mA = Z.valueOf(start);
  }

  @Override
  public Z next() {
    final Z result = mA;
    final String s = mA.toString();
    final int[] counts = ZUtils.digitCounts(mA);
    final boolean[] seen = {false, false, false, false, false, false, false, false, false, false}; // 10 x false
    final StringBuilder sb = new StringBuilder();
    for (int k = s.length() - 1; k >= 0; --k) { // from the right
      final int ich = s.charAt(k) - '0';
      if (!seen[ich]) {
        sb.append(counts[ich]).append(ich);
        seen[ich] = true;
      }
    }
    mA = new Z(sb);
    return result;
  }
}
