package irvine.oeis.a069;

import java.util.Map;

import irvine.math.z.Z;

/**
 * A069326 Number of 4 X n binary arrays with path of adjacent 1's from upper right corner to lower left corner.
 * @author Sean A. Irvine
 */
public class A069326 extends A069295 {

  private final int mCols;
  protected int mN;

  protected A069326(final int offset, final int cols) {
    super(offset);
    mCols = cols;
    mN = offset - 1;
  }

  /** Construct the sequence. */
  public A069326() {
    this(1, 4);
  }

  @Override
  protected Z getResult(final Map<A069295.State, Z> states) {
    Z sum = Z.ZERO;
    for (final Map.Entry<State, Z> e : states.entrySet()) {
      if (e.getKey().get(mN - 1) == 1) {
        sum = sum.add(e.getValue());
      }
    }
    return sum;
  }

  @Override
  public Z next() {
    return count(++mN, mCols);
  }
}
