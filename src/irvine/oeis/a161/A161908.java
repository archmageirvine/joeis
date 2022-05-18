package irvine.oeis.a161;

import java.util.LinkedList;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A161908 Array read by rows in which row n lists the divisors of n that are &gt;= sqrt(n).
 * @author Sean A. Irvine
 */
public class A161908 implements Sequence {

  private final LinkedList<Z> mLinkedList = new LinkedList<>();
  {
    mLinkedList.add(Z.ONE);
  }
  private Z mN = Z.ONE;

  @Override
  public Z next() {
    if (mLinkedList.isEmpty()) {
      mN = mN.add(1);
      final Z[] sr = mN.sqrtAndRemainder();
      final Z sqrt = sr[1].isZero() ? sr[0] : sr[0].add(1);
      for (final Z d : Jaguar.factor(mN).divisorsSorted()) {
        if (d.compareTo(sqrt) >= 0) {
          mLinkedList.add(d);
        }
      }
    }
    return mLinkedList.pop();
  }
}

