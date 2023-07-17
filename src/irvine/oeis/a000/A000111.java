package irvine.oeis.a000;

import java.util.ArrayList;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000111 Euler or up/down numbers: e.g.f. sec(x) + tan(x). Also for n &gt;= 2, half the number of alternating permutations on n letters (A001250).
 * @author Sean A. Irvine
 */
public class A000111 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000111(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000111() {
    super(0);
  }

  protected final ArrayList<Z> mA = new ArrayList<>();
  protected int mN = -1;

  @Override
  public Z next() {
    if (++mN < 3) {
      mA.add(Z.ONE);
      return Z.ONE;
    }
    if (mN < 0) {
      throw new UnsupportedOperationException();
    }
    Z sum = Z.ZERO;
    for (int k = 0; k < mN; ++k) {
      sum = sum.add(mA.get(k).multiply(mA.get(mN - 1 - k)).multiply(Binomial.binomial(mN - 1, k)));
    }
    sum = sum.divide2();
    mA.add(sum);
    return sum;
  }
}

