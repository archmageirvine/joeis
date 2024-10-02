package irvine.oeis;

import java.util.ArrayList;

import irvine.factor.factor.Jaguar;
import irvine.math.api.RationalSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * Compute the sequence whose Dirichlet convolution with itself yields some underlying sequence.
 * An example (with PARI programs) is A317937.
 * @author Georg Fischer
 */
public class DirichletSquareRootSequence extends AbstractSequence implements RationalSequence {

  /** Type code for a numerator sequence. */
  public static final int NUM = 1;
  /** Type code for a denominator sequence. */
  public static final int DEN = 2;
  private final MemorySequence mSeq;
  private final ArrayList<Q> mAs; // this sequence remembered
  private int mN; // current index >= 1
  private final int mMode; // either NUM or DEN
  private Z mV1; // value of mSeq.a(1)

  /**
   * Create a new sequence.
   * @param offset first index of target sequence
   * @param seq underlying sequence
   * @param mode either NUM or DEN
   */
  public DirichletSquareRootSequence(int offset, final AbstractSequence seq, final int mode) {
    super(offset);
    mN = offset - 1;
    mAs = new ArrayList<>();
    while (--offset >= 0) {
      mAs.add(Q.ZERO); // leading terms, not used
    }
    mSeq = MemorySequence.cachedSequence(seq.getOffset() == 0 ? seq : new PrependSequence(0, seq, 0));
    mMode = mode;
  }

  /*
    A317937 Numerators of sequence whose Dirichlet convolution with itself yields sequence A001221
    DirSqrt(v)={my(n=#v, u=vector(n)); u[1]=1;
    for(n=2, n, u[n]=(v[n]/v[1] - sumdiv(n, d, if(d>1&&d<n, u[d]*u[n/d], 0)))/2); u}
  */
  @Override
  public Q nextQ() {
    ++mN;
    if (mN == 1) {
      mAs.add(Q.ONE); // a(1) = 1
      mV1 = mSeq.a(1);
      return Q.ONE;
    } else {
      Q sum = Q.ZERO;
      for (final Z dd : Jaguar.factor(mN).divisors()) {
        final int d = dd.intValue();
        if (d > 1 && d < mN) {
          sum = sum.add(mAs.get(d).multiply(mAs.get(mN / d)));
        }
      }
      final Q result = new Q(mSeq.a(mN), mV1).subtract(sum).divide(Q.TWO);
      mAs.add(result);
      return result;
    }
  }

  @Override
  public Z next() {
    return mMode == NUM ? nextQ().num() : nextQ().den();
  }
}
