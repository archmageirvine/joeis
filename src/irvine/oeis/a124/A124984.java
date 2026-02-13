package irvine.oeis.a124;

import java.util.function.Function;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A124984 Primes of the form 8*k + 3 generated recursively. Initial prime is 3. General term is a(n) = Min_{p is prime; p divides 2 + Q^2; p == 3 (mod 8)},
 * where Q is the product of previous terms in the sequence.
 * @author Georg Fischer
 */
public class A124984 extends AbstractSequence {

  private int mN; // current index
  private int mFactor; // p == mResidue mod mFactor
  private int mResidue;
  private Function<Z, Z> mLambda; // 
  private Z mQ; // product of previous terms in the sequence 

  /** Construct the sequence. */
  public A124984() {
    this(1, Z.THREE, 8, 3, q -> q.square().add(2));
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param init initial prime
   * @param factor p == residue mod factor
   * @param residue the residue
   * @param lambda expression in mQ that is divisible by p
   */
  public A124984(final int offset, final Z init, final int factor, final int residue, final Function<Z, Z> lambda) {
    super(offset);
    mN = 0;
    mQ = init;
    mFactor = factor;
    mResidue = residue;
    mLambda = lambda;
  }

  @Override
  public Z next() {
//  (PARI) lista(nn) = my(f, q=3); print1(q); 
//  for(n=2, nn, f=factor(2+q^2)[, 1]~; for(i=1, #f, if(f[i]%8==3, print1(", ", f[i]); q*=f[i]; break)));
    if (++mN == 1) {
      return mQ;
    }
    final FactorSequence fs = Jaguar.factor(mLambda.apply(mQ));
    for (final Z f : fs.toZArray()) {
      if (f.mod(mFactor) == mResidue) {
        mQ = mQ.multiply(f);
        return f;
      }
    }
    return mQ;
  }

}
