package irvine.oeis.a161;

import java.util.Arrays;
import java.util.LinkedList;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A161906.
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
      final Z[] divs = Cheetah.factor(mN).divisors();
      Arrays.sort(divs);
      for (final Z d : divs) {
        if (d.compareTo(sqrt) <= 0) {
          mLinkedList.add(d);
        }
      }
    }
    return mLinkedList.pop();
  }
}

