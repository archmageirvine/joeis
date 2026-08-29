package irvine.oeis.a272;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A272011 Irregular triangle read by rows: strictly decreasing sequences of nonnegative numbers given in lexicographic order.
 * @author Georg Fischer
 */
public class A272011 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A272011(final int offset) {
    super(offset);
    next();
  }

  /** Construct the sequence. */
  public A272011() {
    super(0);
    next();
  }

  // After Alois P. Heinz

  private final ArrayList<Long> mA = new ArrayList<>();
  private long mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mA.size()) {
      mA.clear();
      if (++mN == 0) {
        return Z.ZERO;
      } else {
        long k = 0;
        long m = mN;
        while (m != 0) {
          ++k;
          if ((m & 1) == 1) {
            mA.add(0, k);
          }
          m >>>= 1;
        }
      }
      mM = 0;
    }
    return Z.valueOf(mA.get(mM) - 1);
  }
}
