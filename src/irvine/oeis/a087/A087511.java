package irvine.oeis.a087;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a031.A031443;

/**
 * A087511 Primes consisting only of digits 1 and 3 occurring with equal frequency.
 * @author Georg Fischer
 */
public class A087511 extends A031443 {

  private char mD1; // first digit
  private char mD2; // second, higher digit
  private TreeSet<Z> mPrimes; // sorted queue for primes
  private String mPaired; // result of super.next() with replacements '0' -> 'a', '1' -> 'b'
  private int mWidth; // number of digits in mPaired


  /** Construct the sequence. */
  public A087511() {
    this('1', '3');
  }

  /**
   * Generic constructor with parameters.
   * The two digits must be different from '0'.
   * @param d1 first digit
   * @param d2 second digit
   */
  public A087511(final char d1, final char d2) {
    if (d1 < d2) {
      mD1 = d1;
      mD2 = d2;
    } else { // rearrange such that mD1 < mD2
      mD1 = d2;
      mD2 = d1;
    }
    mPrimes = new TreeSet<>();
    mPaired = super.next().toString(2).replace('0', 'a').replace('1', 'b'); // start with "ba"
    mWidth = mPaired.length();
  }

  /**
   * Accumulate all primes of width <code>mWidth</code>.
   */
  private void fillWidth() {
    boolean busy = true;
    while (busy) {
      Z m = new Z(mPaired.replace('a', mD1).replace('b', mD2)); // the smaller alternative
      if (m.isProbablePrime()) {
        mPrimes.add(m);
      }
      m = new Z(mPaired.replace('b', mD1).replace('a', mD2)); // the smaller alternative
      if (m.isProbablePrime()) {
        mPrimes.add(m);
      }
      mPaired = super.next().toString(2).replace('0', 'a').replace('1', 'b');
      if (mPaired.length() > mWidth) {
        busy = false;
        mWidth = mPaired.length();
      }
    }
  }

  @Override
  public Z next() {
    Z result = mPrimes.pollFirst();
    while (result == null) {
      fillWidth();
      result = mPrimes.pollFirst();
    }
    return result;
  }
}
