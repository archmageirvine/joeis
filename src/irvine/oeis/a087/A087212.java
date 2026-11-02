package irvine.oeis.a087;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087212 Number of ways in which n X n cells may be numbered using nonzero digits so that n n-digit squares are formed when read across or down the grids.
 * @author Sean A. Irvine
 */
public class A087212 extends Sequence1 {

  private int mN = 0;
  private ArrayList<Z> mSquares = null;
  private List<Set<Z>> mSuffixes = null;
  private long mCount = 0;

  private ArrayList<Z> buildSquares(final int n) {
    final ArrayList<Z> squares = new ArrayList<>();
    final Z lim = Z.TEN.pow(n);
    Z k = Z.TEN.pow(n - 1).sqrt();
    while (true) {
      final Z s = k.square();
      if (s.compareTo(lim) >= 0) {
        break;
      }
      if ((Functions.SYNDROME.i(s) & 1) == 0) {
        squares.add(s);
      }
      k = k.add(1);
    }
    return squares;
  }

  private List<Set<Z>> buildSuffixes(final ArrayList<Z> squares, final int n) {
    final List<Set<Z>> suffixes = new ArrayList<>();
    for (int k = 1; k <= n; ++k) {
      final Z mod = Z.TEN.pow(k);
      final Set<Z> s = new HashSet<>();
      for (final Z v : squares) {
        s.add(v.mod(mod));
      }
      suffixes.add(s);
    }
    return suffixes;
  }

  private boolean isOk(final int row, final Z mul, final Z square, final Z[] cols) {
    final Set<Z> suffixes = mSuffixes.get(row);
    Z s = square;
    for (int k = 0; k < cols.length; ++k) {
      final Z[] qr = s.divideAndRemainder(Z.TEN);
      final Z v = qr[1].multiply(mul).add(cols[k]);
      if (!suffixes.contains(v)) {
        return false;
      }
      s = qr[0];
    }
    return true;
  }

  private void place(final Z mul, final Z square, final Z[] cols) {
    Z s = square;
    for (int k = 0; k < cols.length; ++k) {
      final Z[] qr = s.divideAndRemainder(Z.TEN);
      cols[k] = qr[1].multiply(mul).add(cols[k]);
      s = qr[0];
    }
  }

  private void search(final int row, final Z[] cols) {
    if (row == mN) {
      ++mCount;
      return;
    }
    // We fill from bottom to top, one row at a time checking allowed suffixes
    final Z mul = Z.TEN.pow(row);
    for (final Z square : mSquares) {
      if (isOk(row, mul, square, cols)) {
        final Z[] colCopy = cols.clone();
        place(mul, square, colCopy);
        search(row + 1, colCopy);
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    mSquares = buildSquares(mN);
    mSuffixes = buildSuffixes(mSquares, mN);
    mCount = 0;
    final Z[] cols = new Z[mN];
    Arrays.fill(cols, Z.ZERO);
    search(0, cols);
    return Z.valueOf(mCount);
  }
}
