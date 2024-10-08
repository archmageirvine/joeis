package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072520 Index of smallest Fibonacci number beginning with the n-th Fibonacci number other than itself.
 * @author Sean A. Irvine
 */
public class A072520 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final String s = Functions.FIBONACCI.z(++mN).toString();
    long k = mN;
    while (true) {
      final Z t = Functions.FIBONACCI.z(++k);
      final String ts = t.toString();
      if (ts.startsWith(s) && !ts.equals(s)) {
        return Z.valueOf(k);
      }
    }
  }
}
