package irvine.oeis.a214;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a031.A031443;

/**
 * A214218 Numbers consisting only of digits 1 and 2 occurring with equal frequency.
 * @author Georg Fischer
 */
public class A214218 extends AbstractSequence {

  private final A031443 mSeq = new A031443();
  private final char mD1; // first digit
  private final char mD2; // second, higher digit
  private final TreeSet<Z> mQueue; // sorted queue of resulting numbers
  private String mPaired; // result of mSeq.next() with replacements '0' -> 'a', '1' -> 'b'
  private int mWidth; // number of digits in mPaired


  /** Construct the sequence. */
  public A214218() {
    this(1, '1', '2');
  }

  /**
   * Generic constructor with parameters.
   * The two digits must be different from '0'.
   * @param offset first index
   * @param d1 first digit
   * @param d2 second digit
   */
  public A214218(final int offset, final char d1, final char d2) {
    super(offset);
    if (d1 < d2) {
      mD1 = d1;
      mD2 = d2;
    } else { // rearrange such that mD1 < mD2
      mD1 = d2;
      mD2 = d1;
    }
    mQueue = new TreeSet<>();
    mPaired = mSeq.next().toString(2).replace('0', 'a').replace('1', 'b'); // start with "ba"
    mWidth = mPaired.length();
  }

  /**
   * Accumulate all primes of width <code>mWidth</code>.
   */
  private void fillWidth() {
    boolean busy = true;
    while (busy) {
      Z m = new Z(mPaired.replace('a', mD1).replace('b', mD2)); // the smaller alternative
      mQueue.add(m);
      m = new Z(mPaired.replace('b', mD1).replace('a', mD2)); // the smaller alternative
      mQueue.add(m);
      mPaired = mSeq.next().toString(2).replace('0', 'a').replace('1', 'b');
      if (mPaired.length() > mWidth) {
        busy = false;
        mWidth = mPaired.length();
      }
    }
  }

  @Override
  public Z next() {
    Z result = mQueue.pollFirst();
    while (result == null) {
      fillWidth();
      result = mQueue.pollFirst();
    }
    return result;
  }
}
