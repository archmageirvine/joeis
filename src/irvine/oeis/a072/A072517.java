package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072517 Smallest triangular number beginning with the n-th triangular number other than itself.
 * @author Sean A. Irvine
 */
public class A072517 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final String s = Functions.TRIANGULAR.z(++mN).toString();
    long k = mN;
    while (true) {
      final Z t = Functions.TRIANGULAR.z(++k);
      if (t.toString().startsWith(s)) {
        return t;
      }
    }
  }
}
