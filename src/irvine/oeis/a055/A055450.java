package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A055450 Path-counting array T; each step of a path is (1 right) or (1 up) to a point below line y=x, else (1 right and 1 up) or (1 up) to a point on the line y=x, else (1 left) or (1 up) to a point above line y=x. T(i,j)=number of paths to point (i-j,j), for 1&lt;=j&lt;=i, i &gt;= 1.
 * @author Sean A. Irvine
 */
public class A055450 extends MemoryFunction2Sequence<Long, Z> {

  /** Construct the sequence. */
  public A055450() {
    this(0);
  }

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A055450(final int offset) {
    super(offset);
  }

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long i, final Long j) {
    if (j == 0) {
      return Z.ONE;
    }
    if (2 * j < i) {
      return get(i - 1, j - 1).add(get(i - 1, j));
    }
    if (2 * j == i) {
      return get(2 * j - 2, j - 1).add(get(2 * j - 1, j - 1));
    }
    final long k = 2 * j - i;
    return get(2 * j - k + 1, j).add(get(2 * j - k - 1, j - 1));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, mM);
  }
}
