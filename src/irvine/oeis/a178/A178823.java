package irvine.oeis.a178;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.English;

/**
 * A178823 a(1) = 1, a(n+1) = least k &gt; a(n) such that the sum of the number of letters in the English name of all values in the sequence through a(n), excluding spaces and hyphens (A005589), is prime.
 * @author Sean A. Irvine
 */
public class A178823 extends Sequence1 {

  private int mN = 0;
  private long mSum = 0;

  @Override
  public Z next() {
    while (true) {
      final int s = English.SINGLETON.toText(++mN).length();
      if (Predicates.PRIME.is(mSum + s)) {
        mSum += s;
        return Z.valueOf(mN);
      }
    }
  }
}
