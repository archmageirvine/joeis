package irvine.oeis;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.z.Z;

/**
 * Sequence consisting of all powers of another (ordered) sequence.
 * @author Sean A. Irvine
 */
public class PowerClosureSequence extends AbstractSequence {

  private final MemorySequence mSeq;
  private final TreeMap<Z, Z> mA = new TreeMap<>();
  private Z mB;

  /**
   * Construct the power closure of another sequence.
   * @param seq underlying sequence
   */
  public PowerClosureSequence(final Sequence seq) {
    super(seq.getOffset());
    mSeq = MemorySequence.cachedSequence(seq);
    mB = mSeq.next();
  }

  @Override
  public Z next() {
    if (mA.isEmpty() || mA.firstKey().compareTo(mB) >= 0) {
      mA.put(mB, mB);
      mB = mSeq.next();
    }
    final Map.Entry<Z, Z> e = mA.pollFirstEntry();
    if (e.getKey().abs().compareTo(Z.ONE) > 0) {
      mA.put(e.getKey().multiply(e.getValue()), e.getValue());
    }
    return e.getKey();
  }
}
