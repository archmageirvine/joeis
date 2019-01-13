package irvine.oeis.a007;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007972.
 * @author Sean A. Irvine
 */
public class A007972 implements Sequence {

  // Much simpler conjectured formulas exist, this is brute force.

  private int mN = 2;
  private final HashSet<String> mSeen = new HashSet<>();

  static void reverse(final char[] p, final int start, final int length) {
    for (int k = start, j = start + length - 1; k < j; ++k, --j) {
      final char t = p[k];
      p[k] = p[j];
      p[j] = t;
    }
  }

  private void search(final char[] p, final int r) {
    for (int start = 0; start < p.length; ++start) {
      for (int length = 2; length <= p.length - start; ++length) {
        reverse(p, start, length);
        if (r <= 1) {
          mSeen.add(new String(p));
        } else {
          search(p, r - 1);
        }
        reverse(p, start, length); // undo
      }
    }
  }

  @Override
  public Z next() {
    final char[] p = new char[++mN];
    for (int k = 0; k < p.length; ++k) {
      p[k] = (char) k;
    }
    mSeen.clear();
    search(p, 2);
    return Z.valueOf(mSeen.size() - 1);
  }
}
