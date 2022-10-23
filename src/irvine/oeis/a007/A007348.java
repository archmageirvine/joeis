package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A007348 Primes for which -10 is a primitive root.
 * @author Sean A. Irvine
 */
public class A007348 extends Sequence1 {

  protected Z mParm;
  protected Z mParmNeg;
  
  /** Construct the sequence. */
  public A007348() {
    this(10);
  }
  
  /**
   * Generic constructor with parameter
   * @param parm <code>-parm</code> is a primitive root
   */
  public A007348(final int parm) {
    mParm = Z.valueOf(parm);
    mParmNeg = mParm.negate();
  } 

  private Z mP = Z.ONE;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mP.gcd(mParm).equals(Z.ONE) && ZUtils.testPrimitiveRoot(mParmNeg, mP)) {
        return mP;
      }
    }
  }
}
