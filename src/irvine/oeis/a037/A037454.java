package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037454 a(n) = Sum_{i=0..m} d(i)*6^i, where Sum_{i=0..m} d(i)*3^i is the base 3 representation of n.
 * Implements the "rebase" notation of A000695: (3)[n](6).
 * For example: decimal 30 = 1010 in base 3 (=<code>baseFrom</code>) -&gt; 1010 in base 6 (=<code>baseTo</code>) = 222 in decimal.
 * @author Georg Fischer
 */
public class A037454 implements Sequence {

  private Z mN; // current index
  private final int mBaseFrom;
  private final int mBaseTo;

  /** 
   * Empty constructor
   */
  public A037454() {
    mN = Z.NEG_ONE; // offset 0
    mBaseFrom = 3;
    mBaseTo = 6;
  }

  /** 
   * Constructor with parameters
   * @param offset index of first term
   * @param baseFrom convert from this base
   * @param baseTo convert to this base
   */
  public A037454(final int offset, final int baseFrom, final int baseTo) {
    mN = Z.valueOf(offset).subtract(Z.ONE);
    mBaseFrom = baseFrom;
    mBaseTo = baseTo;
  }

  @Override
  public Z next() {
    mN = mN.add(Z.ONE);
    if (mBaseFrom < mBaseTo) {
      return new Z(mN.toString(mBaseFrom), mBaseTo);
    }  else {
      final String nFrom = mN.toString(mBaseFrom);
      Z sum = Z.ZERO;
      Z toPow = Z.ONE;
      for (int pos = nFrom.length() - 1; pos >= 0; --pos) {
        sum = sum.add(toPow.multiply(Character.digit(nFrom.charAt(pos), mBaseFrom)));
        toPow = toPow.multiply(mBaseTo);
      }
      return sum;
    } 
  }

  /**
   * Test method, rebases from args[0] to args[1], prints args[2] terms.
   */
  public static void main(final String[] args) {
    final int[] parms = {3, 6, 48}; // default parameters
    int iarg     = 0;
    while (iarg < args.length && iarg < 3) { // with arguments
      try {
        parms[iarg] = Integer.parseInt(args[iarg]);
      } catch (final RuntimeException exc) {
        // ignored
      }
      ++iarg;
    } // with arguments
    final Sequence seq = new A037454(0, parms[0], parms[1]);
    for (int iterm = 0; iterm < parms[2]; ++iterm) { // b-file format
      System.out.print((iterm > 0 ? "," : "") + seq.next());
    } // for iterm
    System.out.println();
  } // main

}
