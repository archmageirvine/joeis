package irvine.oeis.a124;

import java.util.function.Function;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.util.string.StringUtils;

/**
 * A124984 Primes of the form 8*k + 3 generated recursively. Initial prime is 3. General term is a(n) = Min_{p is prime; p divides 2 + Q^2; p == 3 (mod 8)}, where Q is the product of previous terms in the sequence.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A124984 extends AbstractSequence {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final int mFactor; // p == mResidue mod mFactor
  private final int mResidue;
  private final Function<Z, Z> mLambda; // function defining the form
  private boolean mFirst = true;
  private Z mQ; // product of previous terms in the sequence

  /** Construct the sequence. */
  public A124984() {
    this(1, Z.THREE, 8, 3, q -> q.square().add(2));
  }

  /**
   * Construct a sequence based on finding prime factors of a particular modulo class.
   * @param offset first index
   * @param init initial prime
   * @param factor p == residue mod factor
   * @param residue the residue
   * @param lambda expression in mQ that is divisible by p
   */
  protected A124984(final int offset, final Z init, final int factor, final int residue, final Function<Z, Z> lambda) {
    super(offset);
    mQ = init;
    mFactor = factor;
    mResidue = residue;
    mLambda = lambda;
  }

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return mQ;
    }
    // Because we only need the least prime factor of a particular form
    // we can often get away with using a partial factorization.
    // This has some chance of making a mistake, if any unfactored part
    // happens to contain a smaller prime of the required form, but
    // this is unlikely to occur in practice.
    final Z m = mLambda.apply(mQ);
    if (mVerbose) {
      StringUtils.message("Factoring: " + m);
    }
    final FactorSequence fs = Jaguar.factorAllowIncomplete(m);
    for (final Z f : fs.toZArray()) {
      if (fs.getStatus(f) == FactorSequence.PRIME || fs.getStatus(f) == FactorSequence.PROB_PRIME) {
        if (f.mod(mFactor) == mResidue) {
          mQ = mQ.multiply(f);
          return f;
        }
      } else {
        // Composite factor found prior to finding a prime of the required form.
        // Since we cannot know if composite factor is divisible by a prime of
        // required form we give up.
        break;
      }
    }
    if (!fs.isComplete()) {
      throw new UnsupportedOperationException("Unfactored: " + m + " -> " + FactorSequence.toString(fs));
    }
    return mQ; // rare case where m has no factor of the required form
  }

}
