package irvine.oeis.a194;

import java.util.TreeMap;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A194832 Triangular array (and fractal sequence): row n is the permutation of (1,2,...,n) obtained from the increasing ordering of fractional parts {r}, {2r}, ..., {nr}, where r= -tau = -(1+sqrt(5))/2.
 * @author Georg Fischer
 */
public class A194832 extends BaseTriangle {

  private TreeMap<CR, Integer> mA;
  private CR mReal;

  /** Construct the sequence. */
  public A194832() {
    this(1, CR.PHI.negate());
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param real real number for the row sequences
   */
  public A194832(final int offset, final CR real) {
    super(offset, 1, 1);
    hasRAM(false);
    mReal = real;
  }

  @Override
  public void addRow() {
    super.addRow();
    int n = mRow + mRowShift;
    mA = new TreeMap<>();
    for (int i = 1; i <= n; ++i) {
      mA.put(mReal.multiply(i).frac(), i);
    }
    int i = -1;
    while (!mA.isEmpty()) {
      mLastRow[++i] = Z.valueOf(mA.pollFirstEntry().getValue());
    }
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return get(n - mRowShift, k - mColShift);
  }

}
