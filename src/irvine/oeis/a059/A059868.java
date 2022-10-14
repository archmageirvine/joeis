package irvine.oeis.a059;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.SequenceWithOffset;
import irvine.oeis.a002.A002069;

/**
 * A059868 There exist no palindromic pentagonal numbers of length a(n).
 * @author Sean A. Irvine
 */
public class A059868 implements SequenceWithOffset {

  private final Sequence mSeq;
  private int mA;
  private final TreeSet<Integer> mQ = new TreeSet<>();

  protected A059868(final Sequence seq) {
    mSeq = seq;
    mA = mSeq.next().toString().length();
  }

  /** Construct the sequence. */
  public A059868() {
    this(new A002069());
  }

  @Override
  public Z next() {
    while (mQ.isEmpty()) {
      final int old = mA;
      mA = mSeq.next().toString().length();
      for (int skipped = old + 1; skipped < mA; ++skipped) {
        mQ.add(skipped);
      }
    }
    return Z.valueOf(mQ.pollFirst());
  }

  @Override
  public int getOffset() {
    return 1;
  }
}
