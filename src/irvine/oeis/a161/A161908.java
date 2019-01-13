package irvine.oeis.a161;

import java.util.Arrays;
import java.util.LinkedList;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A161908.
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
      final Z sqrt = sr[1].equals(Z.ZERO) ? sr[0] : sr[0].add(1);
      final Z[] divs = Cheetah.factor(mN).divisors();
      Arrays.sort(divs);
      for (final Z d : divs) {
        if (d.compareTo(sqrt) >= 0) {
          mLinkedList.add(d);
        }
      }
    }
    return mLinkedList.pop();
  }
}

