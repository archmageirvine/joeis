package irvine.oeis.a001;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001013 Jordan-Polya numbers: products of factorial numbers A000142.
 * @author Sean A. Irvine
 */
public class A001013 implements Sequence {

  private static final int LIMIT = 1 << 7;

  private final HashSet<Z> mProducts = new HashSet<>();
  private final ArrayList<Z> mProductsList = new ArrayList<>();
  private Z mLast = Z.ONE;
  private long mN = 1;
  private int mListPos = -1;

  @Override
  public Z next() {
    if (mProducts.isEmpty()) {
      mProducts.add(Z.ONE);
      mProductsList.add(Z.ONE);
    } else if (mLast.makeOdd().equals(Z.ONE)) {
      // 1, 2, 4, 8, 16 = (2!)^m controls a lower bound, use output
      // of these values to determine when we need to update overall
      // table of values
      final HashSet<Z> newProducts = new HashSet<>();
      Z f = Z.ONE;
      ++mN;
      for (long n = 2; n <= mN; ++n) {
        f = f.multiply(n);
        final int fl = f.bitLength();
        if (fl <= LIMIT) {
          for (final Z v : mProducts) {
            if (fl + v.bitLength() <= LIMIT) {
              newProducts.add(v.multiply(f));
            }
          }
        }
      }
      mProducts.addAll(newProducts);
      mProductsList.clear();
      mProductsList.addAll(mProducts);
      Collections.sort(mProductsList);
    }
    mLast = mProductsList.get(++mListPos);
    if (mLast.bitLength() >= LIMIT) {
      throw new UnsupportedOperationException();
    }
    return mLast;
  }
}
