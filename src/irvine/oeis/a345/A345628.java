package irvine.oeis.a345;

import irvine.math.group.DicyclicGroup;
import irvine.math.z.Z;
import irvine.oeis.OrdersFiniteGroupSequence;
import irvine.oeis.Sequence;

/**
 * A345628 Irregular triangle T(n,k) read by rows of the number of elements of order k in the dicyclic group Dic(n) for n&gt;=2.
 * @author Sean A. Irvine
 */
public class A345628 implements Sequence {

  private int mN = 2;
  private OrdersFiniteGroupSequence mSeq = new OrdersFiniteGroupSequence(new DicyclicGroup(2));

  @Override
  public Z next() {
    final Z t = mSeq.next();
    if (t != null) {
      return t;
    }
    // Step to next row and group
    mSeq = new OrdersFiniteGroupSequence(new DicyclicGroup(++mN));
    return mSeq.next();
  }
}
