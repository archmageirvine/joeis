package irvine.oeis.a109;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a000.A000720;

/**
 * A109555 a(n) = If[Floor[2*Mod[(Prime[n + 1] - Prime[n])*PrimePi[n]/n, 8]] == 0, Prime[n]].
 * @author Georg Fischer
 */
public class A109555 extends A000040 {

  private int mN; // current index
  private Z mResidue;
  private Z mPrimeN1;
  private Sequence mSeq;

  /** Construct the sequence. */
  public A109555() {
    this(0);
  }

  /**
   * Generic constructor with parameter
   * @param residue desired residue
   */
  public A109555(final int residue) {
    mN = 0;
    mResidue = Z.valueOf(residue);
    mSeq = new A000720();
    mPrimeN1 = super.next();
  }

  // floor(2*(((prime(k + 1) - prime(k))*PrimePi(k)) mod (8*k)) / k) = m
  // Flatten[Table[If[Floor[2*Mod[(Prime[n + 1] - Prime[n])*PrimePi[n], 8*n]/n] == 0, Prime[n], {}], {n, 1, 400}]]
  @Override
  public Z next() {
    ++mN;
    Z primeN = mPrimeN1;
    mPrimeN1 = super.next();
    Z primePi = mSeq.next();
    while (!new Q(mPrimeN1.subtract(primeN).multiply(primePi).mod(Z.EIGHT.multiply(mN)).multiply(2), Z.valueOf(mN)).floor().equals(mResidue)) {
      // System.out.println("mN=" + mN + ", mPrimeN1=" + mPrimeN1  + ", primeN=" + primeN + ", primePi=" + primePi + ", mod=" + mPrimeN1.subtract(primeN).multiply(primePi).mod(Z.EIGHT.multiply(mN)));
      ++mN;
      primeN = mPrimeN1;
      mPrimeN1 = super.next();
      primePi = mSeq.next();
    }
    return primeN;
  }
}
