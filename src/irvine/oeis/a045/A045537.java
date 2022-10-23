package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A045537 Least nontrivial exponent e such that n is a substring of n^e.
 * @author Sean A. Irvine
 */
public class A045537 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    final String s = n.toString();
    int e = 1;
    while (!n.pow(++e).toString().contains(s)) {
      // do nothing
    }
    return Z.valueOf(e);
  }
}
