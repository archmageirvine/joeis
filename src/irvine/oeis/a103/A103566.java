package irvine.oeis.a103;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a039.A039701;

/**
 * A103566 Sum of the primes &gt; 5 modulo 3.
 * @author Georg Fischer
 */
public class A103566 extends Sequence1 {

  private int mN;
  private final Sequence mSeq;
  private Z mA;

  /** Construct the sequence. */
  public A103566() {
    this(new A039701(), 1);
  }

  /**
   * Generic constructor with parameters
   * @param seq
   */
  public A103566(final Sequence seq, final int start) {
    mN = 0;
    mSeq = seq;
    mSeq.next();
    mSeq.next();
    mSeq.next();
    mSeq.next();
    mA = Z.valueOf(start);
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return mA;
    }
    mA = mA.add(mSeq.next());
    return mA;
  }
}
