package irvine.oeis;

import java.util.TreeSet;

import irvine.math.z.Z;

/**
 * Multiplicative closure of an increasing sequence.
 * @author Sean A. Irvine
 */
public class MultiplicativeClosureSequence extends MemorySequence {

  private final MemorySequence mSeq;
  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mP;

  /**
   * Construct the multiplicative closure of another sequence.
   * @param seq underlying sequence
   */
  public MultiplicativeClosureSequence(final Sequence seq) {
    mSeq = MemorySequence.cachedSequence(seq);
    mP = mSeq.next();
  }

  @Override
  protected Z computeNext() {
    if (size() == 0) {
      return Z.ONE;
    }
    if (mA.isEmpty() || mA.first().compareTo(mP) >= 0) {
      for (final Z t : this) {
        mA.add(t.multiply(mP));
      }
      mP = mSeq.next();
    }
    final Z res = mA.pollFirst();
    for (final Z t : mSeq) {
      if (!Z.ONE.equals(res)) {
        mA.add(res.multiply(t));
      }
    }
    return res;
  }
}
