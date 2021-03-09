package irvine.oeis.a043;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A043327 a(0)=1; a(1)=1; a(n)= a(n-1) + floor( sqrt(a(n-1)*a(n-2))+ sqrt(a(n-3)*a(n-4))+ ... ).
 * @author Sean A. Irvine
 */
public class A043327 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 1) {
      return Z.ONE;
    }
    CR sum = CR.ZERO;
    for (int k = n - 1; k > 0; k -= 2) {
      sum = sum.add(CR.valueOf(get(k).multiply(get(k - 1))).sqrt());
    }
    return get(n - 1).add(sum.floor());
  }
}
