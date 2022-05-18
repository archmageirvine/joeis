package irvine.oeis;

import java.util.ArrayList;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;

/**
 * Compute the Dirichlet inverse of a sequence.
 * @author Georg Fischer
 */
public class DirichletInverseSequence implements Sequence {

  protected final MemorySequence mSeq;
  private final ArrayList<Z> mAs; // this sequence remembered
  protected int mN; // current index >= 1

  /**
   * Create a new sequence with no additional terms at the front.
   * @param seq main sequence
   */
  public DirichletInverseSequence(final Sequence seq) {
    mN = 0;
    mAs = new ArrayList<>();
    mAs.add(Z.ZERO); // [0] not used
    mSeq = MemorySequence.cachedSequence(seq);
  }

/*
  A305803 Dirichlet inverse of A078898.
  a(1) = 1; for n > 1, a(n) = -Sum_{d|n, d<n} A078898(n/d)*a(d).
*/
  
  @Override
  public Z next() {
    ++mN;
    if (mN == 1) {
      mAs.add(Z.ONE); // a(1) = 1
      return Z.ONE;
    } else {
      Z sum = Z.ZERO;
      for (final Z dd : Jaguar.factor(mN).divisors()) {
        final int d = dd.intValue();
        if (d < mN) {
          sum = sum.add(mSeq.a(mN / d - 1).multiply(mAs.get(d)));
        }
      }
      sum = sum.negate();
      mAs.add(sum);
      return sum;
    }
  } 

}
