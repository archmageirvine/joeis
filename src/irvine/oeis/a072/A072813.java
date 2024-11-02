package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.a001.A001597;

/**
 * A072813 a(n)^A072814(n) is the n-th perfect power.
 * @author Sean A. Irvine
 */
public class A072813 extends A001597 {

  @Override
  public Z next() {
    final Z t = super.next();
    int k = 1;
    while (true) {
      final Z u = t.root(++k);
      if (u.auxiliary() == 1) {
        return u;
      }
    }
  }
}
