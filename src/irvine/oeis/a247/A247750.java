package irvine.oeis.a247;
// manually 2021-08-08

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A247750 Numbers in decimal representation, such that in Czech their digits are in alphabetic order. 
 * @author Georg Fischer
 */
public class A247750 implements Sequence {

  protected int mDistinct; // 1 (0) if (not) distinct
  protected String mDigits;
  protected long mK; // result

  /** Construct the sequence. */
  public A247750() {
    this(0, "4921085763");
  }

  /**
   * Generic constructor with parameter
   * @param distinct whether the digits must be distinct
   * @param digits mapping of the digits 0-9 
   * to the lexicographically ascending digit names in some language
   */
  protected A247750(final int distinct, final String digits) {
    mK = -1;
    mDistinct = distinct;
    mDigits = digits;
  }

  /**
   * Test the property 
   */
  protected boolean isOk(final long k) {
    final String word = String.valueOf(k);
    final int wLen = word.length();
    char och = word.charAt(0);
    int foch = mDigits.indexOf(och);
    int ich = 1; 
    while (ich < wLen) {
      final char nch = word.charAt(ich);
      final int fnch = mDigits.indexOf(nch);
      if (foch + mDistinct <=  fnch) {
        och = nch;
        foch = fnch;
      } else { // f(och) > f(nch)
        if (mDistinct == 1 && wLen - ich > 10 - foch) { 
          // System.out.print("ich=" + ich + ": modify mK=" + mK + " -> ");
          // the rest of the word is longer than the available digits
          int pow10 = 1;
          while (ich + 1 < word.length()) {
            pow10 *= 10;
            ++ich;
          }
          mK = mK - mK % pow10 + pow10;
          // System.out.println(mK + ", pow10=" + pow10 + ", och=" + och + ", nch=" + nch + ", foch=" + foch + ", fnch=" + fnch);
        }
        return false;
      }
      ++ich;
    }
    return true;
   }
   
  @Override
  public Z next() {
    ++mK;
    while (!isOk(mK)) {
      ++mK;
    } 
    return Z.valueOf(mK);
  }
}
