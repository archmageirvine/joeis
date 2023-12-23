package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.transform.GeneralizedEulerTransform;


/**
 * A000586 Number of partitions of n into distinct primes.
 * G.f.: <code>Product_{k&gt;=1} ((1+x^A000040(k)))</code>
 * @author Georg Fischer
 */
public class A000586 extends GeneralizedEulerTransform {

  /**
   * Construct this sequence with a particular base sequence.
   * @param baseSequence base sequence
   */
  public A000586(final Sequence baseSequence) {
    super(0, 1);
    mSeqH = baseSequence;
    mNextH = advanceH(mKh);
  }

  /** Construct the sequence. */
  public A000586() {
    this(new A000040());
  }

  @Override
  protected Z[] advanceF(final long k) {
    return new Z[]{Z.NEG_ONE};
  }

  @Override
  protected Z advanceG(final long k) {
    return Z.NEG_ONE;
  }

  @Override
  protected Z advanceH(final long k) {
    return mSeqH.next();
  }

}
