package irvine.oeis.a093;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A093211 a(n) is the largest number such that all of a(n)'s length-n substrings are distinct and divisible by 11..
 * @author Georg Fischer
 */
public class A093211 extends AbstractSequence {

  private final HashSet<Z> mSet = new HashSet<>();

  protected long mDivm;
  protected Z mDivz;
  protected Z mLast;
  protected long mN;
  private static int sDebug = 0;

  /** Construct the sequence. */
  public A093211() {
    this(11);
  }

  /**
   * Generic constructor with parameters
   * @param div divisor
   */
  public A093211(final long div) {
    super(1);
    mDivm = div;
    mDivz = Z.valueOf(mDivm);
    mN = 0;
  }

  @Override
  public Z next() {
    return compute(++mN);
  }

  // The following code is adopted from 
  // John Cerkan, Python2.7 in the OEIS

  private int[] setgoodlist(final long len) {
    final int[] btmp = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}; // 0..9
    for (int i = 0; i < 10; ++i) {
      final long remain = mDivz.subtract(Z.TEN.pow(len - 1).multiply(i)).longValue() % mDivm;
      if ((mDivm - 10 * remain) % mDivm > 9) {
        btmp[i] = 0; // remove
      }
    }
//    if (sDebug >= 2) {
//      System.out.print("btmp=");
//      String sep = "[";
//      for (int i = 0; i < btmp.length; ++i) {
//        if (btmp[i] != 0) {
//          System.out.print(sep + i);
//          sep = ", ";
//        }
//      }
//      System.out.println("]");
//    }
    return btmp;
  }

  private Z dropdigs(final Z k, final Z l) {
    Z ktmp = k.divide(l).multiply(l).subtract(1);
    while (ktmp.mod(Z.valueOf(mDivm)).intValue() != 0) {
      ktmp = ktmp.subtract(Z.ONE);
    }
//    if (sDebug >= 2) { System.out.println("dropdigs(" + k + "," + l + ") -> " + ktmp); }
    return ktmp;
  }

  private Z walking(final Z k) {
    Z aa = Z.ZERO;
    final Z kt = k.multiply(Z.TEN);
    final Z ktl = kt.mod(mLast);
//    if (sDebug >= 4) {
//      System.out.println("walk in(" + k + "), last=" + mLast + ", ktl=" + ktl);
//    }
    if (ktl.subtract(1).mod(mDivz).add(Z.TEN).compareTo(mDivz) < 0) {
      return aa;
    }
    final Z a = ktl.mod(mDivz).isZero() ? kt : kt.add(mDivz.subtract(ktl.mod(mDivz)));
    final Z al = a.mod(mLast);
    if (!mSet.contains(al)) {
      mSet.add(al);
      aa = aa.max(a);
      aa = aa.max(walking(a));
      mSet.remove(al);
    } else {
    }
//    if (sDebug >= 4) {
//      System.out.println("walk out(" + k + ") -> " + aa);
//    }
    return aa;
  }

  protected Z compute(final long n) {
    final int[] goodlist = setgoodlist(n);
    mLast = Z.TEN.pow(n);
    final Z beg = Z.TEN.pow(n).subtract(1); // '9' x n
    final Z end = Z.TEN.pow(n - 1).subtract(1);
    Z i = beg;
    while (!i.mod(mDivz).isZero()) {
      i = i.subtract(1);
    }
//    if (sDebug >= 2) { System.out.println("i=" + i + ", n=" + n + ", beg=" + beg + ", end=" + end); }
    Z an = i;
    long anlen = n;
    while (i.compareTo(end) > 0) {
      mSet.clear();
      mSet.add(i);
      if (i.mod(Z.valueOf(100000L)).isZero()) {
        anlen = an.toString().length();
        if (anlen > 2 * n) {
          anlen = 2 * n - 1;
        }
      }
      final Z wi = walking(i);
      if (wi.compareTo(an) > 0) {
        an = wi;
      }
      i = i.subtract(mDivz);
      long j = 0;
      boolean busy = true;
      while (busy && j < anlen - n + 1) {
        if (n - j - 1 < 0) {
          busy = false;
        } else {
          final Z jten = Z.TEN.pow(n - j - 1);
          while (goodlist[i.divide(jten).mod(Z.TEN).intValue()] == 0) {
            i = dropdigs(i, jten);
          }
          ++j;
        }
      }
    }
    return an;
  }

//  /**
//   * Main method for testing
//   * @param args command line arguments: divisor
//   */
//  public static void main(String[] args) {
//    long divisor = 11;
//    try {
//      divisor = Integer.parseInt(args[0]);
//    } catch (Exception exc) {
//    }
//    
//    A093211 seq = new A093211(divisor);
//    for (int n = 1; n < 12; n ++) { // main loop
//      System.out.println(n + " " + seq.next());
//    }
//  }
}
