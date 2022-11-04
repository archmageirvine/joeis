package irvine.oeis.a060;

import irvine.math.group.IntegerField;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a002.A002808;

/**
 * A060252 Smallest prime that is the sum of n consecutive composite numbers.
 * @author Sean A. Irvine
 */
public class A060252 extends Sequence2 {

  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    final Sequence composites1 = new A002808();
    final Sequence composites2 = new A002808();
    Z sum = IntegerField.SINGLETON.sum(0, mN - 1, k -> composites1.next());
    while (!sum.isProbablePrime()) {
      sum = sum.subtract(composites2.next()).add(composites1.next());
    }
    return sum;
  }
}
