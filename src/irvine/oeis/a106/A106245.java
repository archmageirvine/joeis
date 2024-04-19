package irvine.oeis.a106;
// manually anopsn 0, 0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a051.A051613;

/**
 * A106245 Number of partitions into powers of distinct primes.
 * @author Georg Fischer
 */
public class A106245 extends AbstractSequence {

  private final A051613 mSeq1 = new A051613();
  private Z mA;
  private int mN = -1;

  /** Construct the sequence. */
  public A106245() {
    super(1);
    mSeq1.next();
    mSeq1.next();
    mA = mSeq1.next();
  }

  @Override
  public Z next() {
    ++mN;
    if (mN <= 1) {
      return Z.ONE;
    }
    final Z b = mSeq1.next();
    final Z result = b.add(mA);
    mA = b;
    return result;
  }
}
