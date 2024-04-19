package irvine.oeis.a362;
// manually anopsn 1,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a058.A058183;

/**
 * A362680 a(n) is the number of decimal digits in A173426(n).
 * @author Georg Fischer
 */
public class A362680 extends AbstractSequence {

  private int mN = -1;
  private final A058183 mSeq1 = new A058183();
  private Z mA;

  /** Construct the sequence. */
  public A362680() {
    super(1);
    mA = mSeq1.next();
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final Z b = mSeq1.next();
    final Z result = b.add(mA);
    mA = b;
    return result;
  }
}
