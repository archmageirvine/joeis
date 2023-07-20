package irvine.oeis.a172;
// manually robot/diffseq at 2023-07-20

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A172457 Numerators of first differences of the sequence A172298(n)/A172282(n).
 * @author Georg Fischer
 */
public class A172457 extends AbstractSequence {

  private Q mA;
  private final A172282 mSeqDen = new A172282();
  private final A172298 mSeqNum = new A172298();

  /** Construct the sequence. */
  public A172457() {
    super(0);
    mA = new Q(mSeqNum.next(), mSeqDen.next());
  }

  @Override
  public Z next() {
    final Q b = new Q(mSeqNum.next(), mSeqDen.next());
    final Q result = b.subtract(mA);
    mA = b;
    return result.num();
  }
}
