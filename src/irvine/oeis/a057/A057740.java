package irvine.oeis.a057;

import irvine.math.group.AlternatingGroup;
import irvine.math.group.IntegersMod;
import irvine.math.z.Z;
import irvine.oeis.OrdersFiniteGroupSequence;
import irvine.oeis.Sequence;

/**
 * A057740 Irregular triangle read by rows: T(n,k) is the number of elements of alternating group A_n having order k, for n &gt;= 1, 1 &lt;= k &lt;= A051593(n).
 * @author Sean A. Irvine
 */
public class A057740 implements Sequence {

  private int mN = 0;
  private Sequence mSeq = null;

  @Override
  public Z next() {
    Z t;
    if (mSeq == null || (t = mSeq.next()) == null) {
      if (++mN == 1) {
        return Z.ONE;
      }
      mSeq = new OrdersFiniteGroupSequence<>(new AlternatingGroup<>(new IntegersMod(mN)));
      t = mSeq.next();
    }
    return t;
  }
}
