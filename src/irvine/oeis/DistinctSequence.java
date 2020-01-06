package irvine.oeis;

import java.util.TreeSet;

import irvine.math.z.Z;

/**
 * A sequence containing the distinct values from another sequence.
 * @author Sean A. Irvine
 */
public class DistinctSequence implements Sequence {

  private final Sequence mA;
  private final TreeSet<Z> mSeen = new TreeSet<>();

  public DistinctSequence(final Sequence a) {
    mA = a;
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = mA.next();
      if (mSeen.add(t)) {
        return t;
      }
    }
  }
}
