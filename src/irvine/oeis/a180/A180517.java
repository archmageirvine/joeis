package irvine.oeis.a180;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A180517 Primes that become a different prime under the mapping 0 &lt;=&gt; 2.
 * @author Georg Fischer
 */
public class A180517 extends A000040 {

  private final char mDigit1;
  private final char mDigit2;
  private final StringBuilder mSB = new StringBuilder(32);

  /** Construct the sequence. */
  public A180517() {
    this(1, 0, 2);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param digit1 replace this with <code>digit2</code>
   * @param digit2 replace this with <code>digit1</code>
   */
  public A180517(final int offset, final int digit1, final int digit2) {
    setOffset(offset);
    mDigit1 = Character.forDigit(digit1, 10);
    mDigit2 = Character.forDigit(digit2, 10);
  }

  @Override
  public Z next() {
    while (true) {
      final Z result = super.next();
      mSB.setLength(0);
      mSB.append(result.toString());
      boolean changed = false;
      for (int ib = mSB.length() - 1; ib >= 0; --ib) {
        final char ch = mSB.charAt(ib);
        if (ch == mDigit1) {
          mSB.setCharAt(ib, mDigit2);
          changed = true;
        } else if (ch == mDigit2) {
          mSB.setCharAt(ib, mDigit1);
          changed = true;
        }
      }
      if (changed) {
        final Z cand = new Z(mSB.toString());
        // System.out.println("result=" + result + ", cand=" + cand);
        if (cand.isProbablePrime()) {
          return result;
        }
      }
    }
  }
}
