package irvine.oeis;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import java.util.ArrayList;
/**
 * Properties of a (simple) periodic continued fraction
 * for the square root of a number,
 * its numerators, denominators and period elements.
 * This class is used for the continued fraction
 * of a single square root, and for the property sequences for
 * the continued fractions of all square roots.
 * @author Georg Fischer
 */
public abstract class RunsBaseSequence implements Sequence {

  protected int mN; // index of current term to be returned
  protected Z mK; // current number with some property
  protected int mOffset; // OEIS offset1 as of generation time

  /**
   * Construct an instance which selects all numbers
   * that have some property in the continued fractions
   * of their square roots.
   * @param offset first valid term has this index
   */
  protected RunsBaseSequence(final int offset) {
    mOffset = offset;
    mN = offset - 1;
    mK = Z.valueOf(mN);
  }

  /**
   * Construct the continued fraction for the square root
   * of a single, specified number.
   * @param offset first valid term has this index
   * @param k compute the sqrt of this non-negative number
   */
  protected RunsBaseSequence(final int offset, final int k) {
    this(offset);
    mK = Z.valueOf(k);
  }

  /**
   * Ensure that the current number has at least a specified number of digits.
   * @param len width number of required digits
   * @param base represent the number in this base
   */
  protected Z ensureWidth(int len, int base) {
    int num = 1;
    int iwid = len - 1;
    while (iwid > 0) {
      num *= base;
      --iwid;
    } // while 
    return Z.valueOf(--num);
  } // ensureWidth

  /**
   * Get the number of runs from a number represented in some base.
   * @param number get the run count from this number
   * @param base represent in this base
   * @return number of subsequences with identical digits
   */
  protected int getRunCount(Z number, int base) {
    String digits;
    int dlen = 1; // assume 1 character per digit
    if (base <= 10) { // one character per digit
      digits = number.toString(base);
    } else { // two characters per digit
      dlen = 2;
      digits = number.toTwoDigits(base);
      if ((digits.length() & 1) == 1) { // odd
        digits = "0" + digits; // make sure that there are pairs
      }
    } // > 10
    int idig = digits.length() - dlen;

    String runElem = digits.substring(idig, idig + dlen);
    int count = 1; // there is always one element = 1 run
    idig -= dlen;
    while (idig >= 0) {
      if (! digits.substring(idig, idig + dlen).equals(runElem)) {
        ++count;
        runElem = digits.substring(idig, idig + dlen);
      }
      idig -= dlen;
    } // while
    return count;
  } // getRunCount

  /**
   * Determine whether the number of runs in a number represented 
   * in some base has a specific value.
   * @param number get the run count from this number
   * @param base represent in this base
   * @param value so many runs are required
   * @return true if the number of run has the value <code>count</code>
   */
  protected boolean hasRunCount(Z number, int base, int value) {
    String digits;
    int dlen = 1; // assume 1 character per digit
    if (base <= 10) { // one character per digit
      digits = number.toString(base);
    } else { // two characters per digit
      dlen = 2;
      digits = number.toTwoDigits(base);
      if ((digits.length() & 1) == 1) { // odd
        digits = "0" + digits; // make sure that there are pairs
      }
    } // > 10
    int idig = digits.length() - dlen;

    String runElem = digits.substring(idig, idig + dlen);
    int count = 1; // there is always one element = 1 run
    idig -= dlen;
    boolean busy = true;
    while (busy && idig >= 0) {
      if (! digits.substring(idig, idig + dlen).equals(runElem)) {
        ++count;
        busy = count <= value; // false if >
        runElem = digits.substring(idig, idig + dlen);
      }
      idig -= dlen;
    } // while
    return busy && count == value;
  } // hasRunCount

  /**
   * Get the number of digits in the base representation of number.
   * @param number number to be investigated
   * @param base represent in this base
   * @param digit count this digit (two characters for base &gt; 10)
   * @return the count of digit in number
   */
  protected int getDigitCount(Z number, int base, int digit) {
    String digits;
    String search;
    int dlen = 1; // assume 1 character per digit
    if (base <= 10) { // one character per digit
      digits = number.toString(base);
      search = String.valueOf(digit);
    } else { // two characters per digit
      dlen = 2;
      digits = number.toTwoDigits(base);
      search = String.format("%02d", digit);
      if ((digits.length() & 1) == 1) { // odd
        digits = "0" + digits; // make sure that there are pairs
      }
    } // > 10
    int idig = digits.length() - dlen;

    int count = 0;
    while (idig >= 0) {
      if (digits.substring(idig, idig + dlen).equals(search)) {
        count++;
      }
      idig -= dlen;
    } // while
    return count;
  } // getDigitCount

//  /**
//   * Get some property of the next number.
//   * This method is an example only.
//   * It is typically overwritten in order to return some other property.
//   * @return property of the next number
//   */
//  protected Z getNextProperty() {
//    mK = mK.add(Z.ONE);
//    return getProperty();
//  } // getNextProperty

  /**
   * Get the next term of a sequence which fulfills some property.
   * @return the next number with the property
   */
  protected Z getNextWithProperty() {
    long loopCheck = 100000000L;
    while (loopCheck > 0) {
      mK = mK.add(Z.ONE);
      if (isOk()) {
        --loopCheck;
        break;
      }
      --loopCheck;
    } // while busy
    if (loopCheck == 0) {
      throw new IllegalArgumentException("More than 10^8 iterations in RunsBaseSequence.getNextWithProperty()");
    }
    return mK;
  } // getNextWithProperty

  /**
   * Get some property of the current number.
   * This method is an example only.
   * It is typically overwritten in order to return some other property.
   * @return a property of the current number <code>mK</code>.
   */
  protected Z getProperty() {
    return mK;
  } // getProperty

  /**
   * Determine whether the current number has the property which includes it in the sequence.
   * This method is an example only.
   * It is typically overwritten in order to test some other property.
   * @return true iff the current number <code>mK</code> has some property.
   */
  protected boolean isOk() {
    return true;
  } // isOk

  /**
   * Get the index of the current term of the sequence.
   * @return the index starting with the offset of the sequence
   */
  protected int getIndex() {
    return mN;
  } // getIndex

  //=====================================
  /** Test method - not yet implemented.
   *  @param args command line arguments: [n [noterms]]
   *  Show various elements related to the continued fraction for the square root of n.
   *  If n is &lt; 0, several properties of the period for all numbers are shown.
   */
  public static void main(String[] args) {
    int n = -1;
    int iarg = 0;
    if (iarg < args.length) {
      try {
        n = Integer.parseInt(args[iarg ++]);
      } catch (Exception exc) {
      }
    }
    int noterms = 16;
    if (iarg < args.length) {
      try {
        noterms = Integer.parseInt(args[iarg ++]);
      } catch (Exception exc) {
      }
    }
  } // main

} // RunsBaseSequence
