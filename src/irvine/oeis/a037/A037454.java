package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037454 a(n) = Sum_{i=0..m} d(i)*6^i, where Sum_{i=0..m} d(i)*3^i is the base 3 representation of n.
 * Implements the "rebase" notation of A000695: (3)[n](6).
 * For example: decimal 30 = 1010 in base 3 <code>(=baseFrom)</code> -&gt; 1010 in base 6 <code>(=baseTo)</code> = 222 in decimal.
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
        sum = sum.add(toPow.multiply(new Z(nFrom.substring(pos, pos + 1))));
        toPow = toPow.multiply(mBaseTo);
      }
      return sum;
    } 
  }

  /**
   * Test method, rebases from <code>args[0]</code> to <code>args[1]</code>
   * @param args bases
   */
  public static void main(final String[] args) {
    int baseFrom = 3;
    int baseTo   = 6;
    final int noTerms  = 32;
    int iarg     = 0;
    if (iarg + 1 < args.length) { // with arguments
      try {
        baseFrom = Integer.parseInt(args[iarg++]);
        baseTo   = Integer.parseInt(args[iarg++]);
      } catch (final RuntimeException exc) {
        // ignored
      }
    } // with arguments
    final Sequence seq = new A037454(0, baseFrom, baseTo);
    for (int iterm = 0; iterm < noTerms; ++iterm) { // b-file format
      System.out.println(iterm + " " + seq.next());
    } // for iterm
  } // main

}
