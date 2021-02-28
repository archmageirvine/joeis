package irvine.oeis.a040;
// manually 2021-02-28

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A040028 Primes p such that x^3 = 2 has a solution mod p.
 * @author Georg Fischer
 */
public class A040028 extends A000040 {

  protected int mExponent; // power of x
  protected Z mModulus;  // desired rest
  protected boolean mHasSolution; // true if the equation should have a solution, false if there should be no solution
  protected ArrayList<Z> mPowers; // k^exp - mod for k=0..p
  protected ArrayList<Z> mNegats; // k^exp - mod for k=0..-p
  protected boolean mOdd; // whether the exponent is odd

  /** Construct the sequence. */
  public A040028() {
    this(3, 2, true);
  }

  /**
   * Generic constructor for similar sequences.
   * @param exponent    power of x
   * @param modulus     desired rest
   * @param hasSolution true if the equation should have a solution, false if there should be no solution
   */
  public A040028(final int exponent, final int modulus, final boolean hasSolution) {
    mExponent = exponent;
    mModulus = Z.valueOf(modulus);
    mHasSolution = hasSolution;
    mOdd = (exponent & 1) == 1;
    mPowers = new ArrayList<Z>(4096);
    mPowers.add(mModulus);
    mPowers.add(Z.ONE.subtract(mModulus));
    if (mOdd) {
      mNegats = new ArrayList<Z>(4096);
      mNegats.add(mModulus);
      mNegats.add(Z.NEG_ONE.subtract(mModulus));
    }
  }

  @Override
  public Z next() {
    Z prime = null;
    boolean busy = true;
    while (busy) {
      prime = super.next(); // next prime
      final int pri = prime.intValue();
      int plen = mPowers.size();
      while (plen <= pri) {
        mPowers.add(Z.valueOf(plen).pow(mExponent).subtract(mModulus));
        if (mOdd) {
          mNegats.add(Z.valueOf(-plen).pow(mExponent).subtract(mModulus));
        }
        // System.out.println("mPowers[" + plen + "] := " + mPowers.get(plen));
        ++plen;
      }
      // mPowers now has all equations for k=0..p
      int ix = 0;
      boolean found = false;
      while (!found && ix < pri) {
        found = mPowers.get(ix).mod(prime).isZero();
        if (mOdd && !found) {
          found = mNegats.get(ix).mod(prime).isZero();
        }
        ++ix;
      } // while !found
      // System.out.println("found=" + found + " for prime " + pri);
      if (mHasSolution) {
        if (found) {
          busy = false;
        }
      } else {
        if (!found) {
          busy = false;
        }
      }
    } // while busy
    return prime;
  } // next
}
