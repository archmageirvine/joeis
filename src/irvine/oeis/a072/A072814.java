package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.a001.A001597;

/**
 * A072814 Smallest exponents of perfect powers: A001597(n)=A072813(n)^a(n).
 * @author Sean A. Irvine
 */
public class A072814 extends A001597 {

  @Override
  public Z next() {
    final Z t = super.next();
    int k = 1;
    while (true) {
      if (t.root(++k).auxiliary() == 1) {
        return Z.valueOf(k);
      }
    }
  }
}
