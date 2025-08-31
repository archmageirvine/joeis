package irvine.oeis.a386;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A386376 a(n) is the smallest integer k such that b(n,k) is squarefree, where b(n,1) = n and b(n, k+1) = b(n,k) + rad(b(n, k)) for k &gt;= 1.
 * @author Sean A. Irvine
 */
public class A386376 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z b = Z.valueOf(++mN);
    long k = 1;
    while (!Predicates.SQUARE_FREE.is(b)) {
      b = b.add(Functions.RAD.z(b));
      ++k;
    }
    return Z.valueOf(k);
  }
}

