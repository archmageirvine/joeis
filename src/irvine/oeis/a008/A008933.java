package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008933 Number of strictly increasing addition chains of length <code>n</code>.
 * @author Sean A. Irvine
 */
public class A008933 implements Sequence {

  private long mCount = 0;
  private int mN = -1;

  protected void search(final int[] chain, final int pos) {
    if (pos == mN) {
      ++mCount;
    } else {
      final int last = chain[pos];
      for (int next = last + 1; next <= 2 * last; ++next) {
        if (A008928.isExtendable(chain, pos, next)) {
          chain[pos + 1] = next;
          search(chain, pos + 1);
        }
      }
    }
  }

  @Override
  public Z next() {
    mCount = 0;
    final int[] chain = new int[++mN + 1];
    chain[0] = 1;
    search(chain, 0);
    return Z.valueOf(mCount);
  }
}
