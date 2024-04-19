package irvine.oeis.a028;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A028691 Least positive value of k for which the n-th sorted Galois number divides k!.
 * @author Sean A. Irvine
 */
public class A028691 extends A028689 {


  @Override
  public Z next() {
    final Z a = super.next();
    int k = 0;
    while (true) {
      final int n = ++k;
      if (Functions.FACTORIAL.z(n).mod(a).isZero()) {
        return Z.valueOf(k);
      }
    }
  }
}
