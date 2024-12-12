package irvine.oeis.a073;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000796;

/**
 * A073565.
 * @author Sean A. Irvine
 */
public class A073622 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final Sequence mSeq;
  private final HashSet<Long> mUsed = new HashSet<>();
  private long mNextDigit;

  protected A073622(final Sequence seq) {
    mSeq = seq;
    mNextDigit = mSeq.next().longValue();
  }

  /** Construct the sequence. */
  public A073622() {
    this(new A000796());
  }

  @Override
  public Z next() {
    final StringBuilder sb = new StringBuilder();
    do {
      sb.append(mNextDigit);
      mNextDigit = mSeq.next().longValue();
    } while (mNextDigit == 0);
    final String prefix = sb.toString();
    long p = 1;
    while (true) {
      p = mPrime.nextPrime(p);
      if (String.valueOf(p).startsWith(prefix) && mUsed.add(p)) {
        return Z.valueOf(p);
      }
    }
  }
}
