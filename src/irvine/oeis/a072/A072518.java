package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072518 Index of smallest triangular number beginning with the n-th triangular number other than itself.
 * @author Sean A. Irvine
 */
public class A072518 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final String s = Functions.TRIANGULAR.z(++mN).toString();
    long k = mN;
    while (true) {
      if (Functions.TRIANGULAR.z(++k).toString().startsWith(s)) {
        return Z.valueOf(k);
      }
    }
  }
}
