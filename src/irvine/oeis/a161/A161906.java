package irvine.oeis.a161;

import java.util.LinkedList;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A161906 Triangle read by rows in which row n lists the divisors of n that are &lt;= sqrt(n).
 * @author Sean A. Irvine
 */
public class A161906 extends Sequence1 {

  private final LinkedList<Z> mLinkedList = new LinkedList<>();
  {
    mLinkedList.add(Z.ONE);
  }
  private Z mN = Z.ONE;

  @Override
  public Z next() {
    if (mLinkedList.isEmpty()) {
      mN = mN.add(1);
      final Z sqrt = mN.sqrt();
      for (final Z d : Jaguar.factor(mN).divisorsSorted()) {
        if (d.compareTo(sqrt) <= 0) {
          mLinkedList.add(d);
        }
      }
    }
    return mLinkedList.pop();
  }
}

