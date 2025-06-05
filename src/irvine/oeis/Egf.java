package irvine.oeis;

import irvine.math.z.Z;

/**
 * Interface used by <code>PolynomialFieldSequence</code> to wrap a sequence
 * which is to be treated as an exponential generating function.
 * @author Sean A. Irvine
 */
public interface Egf {

  final class EgfSequence extends AbstractSequence implements Egf {
    private final Sequence mSeq;

    private EgfSequence(final Sequence seq) {
      super(seq.getOffset());
      mSeq = seq;
    }

    @Override
    public Z next() {
      return mSeq.next();
    }
  }

  static Sequence wrap(final Sequence seq) {
    return new EgfSequence(seq);
  }
}

