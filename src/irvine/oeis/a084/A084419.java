package irvine.oeis.a084;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A084419 a(n) = number of primes that can be formed by adding 1 to the product of any subset of the divisors of n.
 * @author Sean A. Irvine
 */
public class A084419 extends Sequence1 {

  private long mN = 0;

  private void search(final long[] d, final HashSet<Z> prods, final Z prod, final int pos) {
    if (pos >= d.length) {
      if (prod.add(1).isProbablePrime()) {
        prods.add(prod);
      }
      return;
    }
    search(d, prods, prod, pos + 1);
    search(d, prods, prod.multiply(d[pos]), pos + 1);
  }

  @Override
  public Z next() {
    final HashSet<Z> primeProds = new HashSet<>();
    final long[] d = ZUtils.toLong(Jaguar.factor(++mN).divisors());
    search(d, primeProds, Z.ONE, 1);
    return Z.valueOf(primeProds.size());
  }
}
