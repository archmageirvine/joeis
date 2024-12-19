package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002182;

/**
 * A073772 Number of highly composite numbers (HCNs) between the n-th highly composite number k and 2*k if 2*k is a highly composite number, or -1 if 2*k is not a highly composite number.
 * @author Sean A. Irvine
 */
public class A073772 extends Sequence1 {

  private final DirectSequence mASeq = DirectSequence.create(new A002182());
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z a = mASeq.a(mN);
    final Z a2 = a.multiply2();
    int m = mN;
    while (mASeq.a(++m).compareTo(a2) < 0) {
      // do nothing
    }
    return a2.equals(mASeq.a(m)) ? Z.valueOf(m - mN - 1) : Z.NEG_ONE;
  }
}
