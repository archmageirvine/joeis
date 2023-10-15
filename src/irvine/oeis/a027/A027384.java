package irvine.oeis.a027;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A027384 Number of distinct products i*j with 0 &lt;= i, j &lt;= n.
 * @author Sean A. Irvine
 */
public class A027384 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A027384(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A027384() {
    super(0);
  }

  private final TreeSet<Long> mSeen = new TreeSet<>();
  protected long mN = -1;

  @Override
  public Z next() {
    ++mN;
    for (long k = 0; k <= mN; ++k) {
      mSeen.add(k * mN);
    }
    return Z.valueOf(mSeen.size());
  }
}
