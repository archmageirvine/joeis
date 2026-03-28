package irvine.oeis.a305;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A305213 a(n) is the smallest nonnegative integer whose first n binary digits coincide with its first n decimal digits.
 * @author Sean A. Irvine
 */
public class A305213 extends Sequence1 {

  // After Bert Dobbelaere

  private final int mRadixHi;
  private final int mRadixLo;
  private int mN = 0;

  protected A305213(final int hi, final int lo) {
    mRadixHi = hi;
    mRadixLo = lo;
  }

  /** Construct the sequence. */
  public A305213() {
    this(10, 2);
  }

  private Z solvematch(final Z startHi, final Z startLo, final int digLeft, final int powHi, final int powLo) {
    if (digLeft <= 0) {
      return startHi;
    }
    if (powHi < 0 || powLo < 0) {
      return null;
    }
    final int startd = startHi.isZero() ? 1 : 0;
    final Z powHiVal = Z.valueOf(mRadixHi).pow(powHi);
    final Z powLoVal = Z.valueOf(mRadixLo).pow(powLo);
    for (int d = startd; d < mRadixLo; ++d) {
      final Z bh = startHi.add(powHiVal.multiply(d));
      final Z bl = startLo.add(powLoVal.multiply(d));

      // overlap test: bh < bl + 2^powLo and bl < bh + 10^powHi
      if (bh.compareTo(bl.add(powLoVal)) < 0 && bl.compareTo(bh.add(powHiVal)) < 0) {
        final Z res = solvematch(bh, bl, digLeft - 1, powHi - 1, powLo - 1);
        if (res != null) {
          return res;
        }
      }
    }
    return null;
  }

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.ZERO; // special case
    }

    int dHi = mN - 1;
    Z sol = null;
    while (sol == null) {
      int dLo = dHi;
      final Z powHiVal = Z.valueOf(mRadixHi).pow(dHi);
      while (Z.valueOf(mRadixLo).pow(dLo).compareTo(powHiVal.multiply(2)) < 0) {
        final Z res = solvematch(Z.ZERO, Z.ZERO, mN, dHi, dLo);
        if (res != null) {
          sol = sol == null ? res : sol.min(res);
        }
        ++dLo;
      }
      ++dHi;
    }
    return sol;
  }
}
