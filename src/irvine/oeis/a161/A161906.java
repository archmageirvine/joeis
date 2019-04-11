package irvine.oeis.a161;

import java.util.LinkedList;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A161906 Array read by rows in which row n lists the divisors of n that are <code>&lt;= sqrt(n)</code>.
 * @author Sean A. Irvine
 */
public class A161906 implements Sequence {

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
      for (final Z d : Cheetah.factor(mN).divisorsSorted()) {
        if (d.compareTo(sqrt) <= 0) {
          mLinkedList.add(d);
        }
      }
    }
    return mLinkedList.pop();
  }
}

