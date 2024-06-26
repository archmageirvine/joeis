package irvine.oeis.a033;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033862 Sorted number reached from starter n in Sort-then-add sequence, or -1 if never reaches sorted number.
 * @author Sean A. Irvine
 */
public class A033862 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z s;
    Z a = mN;
    while (!(s = Functions.DIGIT_SORT_ASCENDING.z(a)).equals(a)) {
      a = a.add(s);
    }
    return a;
  }
}
