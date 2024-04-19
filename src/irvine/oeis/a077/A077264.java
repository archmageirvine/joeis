package irvine.oeis.a077;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A077264 Table of arithmetic sequences, by antidiagonals.
 * @author Georg Fischer
 */
public class A077264 extends UpperLeftTriangle {

  private long mTrix; // index of current triangular number
  private long mStart; // value of T(n, 0)
  private final ArrayList<Z> mTrin = new ArrayList<>(); // increment for row n

  /** Construct the sequence. */
  public A077264() {
    super(0, 0, 1);
    hasRAM(false);
    mTrix = 1;
    mTrin.add(Z.ONE);
    mStart = 0;
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    if (k == 0) {
      final Z result = Z.valueOf(mStart);
      ++mStart;
      if (mStart >= mTrix) {
        ++mTrix;
        mStart = 0;
      }
      mTrin.add(Z.valueOf(mTrix));
      return result;
    }
    return get(n, 0).add(mTrin.get(n).multiply(k));
  }
}
