package irvine.oeis.a075;

import irvine.factor.prime.Fast;
import irvine.lisp.SExpression;
import irvine.math.MemoryFunction;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;

/**
 * A075162 Position of A014486(n) in A075165, minus one.
 * @author Sean A. Irvine
 */
public class A075162 extends A014486 {

  private final Fast mPrime = new Fast();
  private final MemoryFunction<SExpression, Z> mInv = new MemoryFunction<>() {
    @Override
    protected Z compute(final SExpression key) {
      //System.out.println("Req: " + key);
      if (key.isEmpty()) {
        return Z.ONE;
      }
      Z prod = Z.ONE;
      Z p = Functions.PRIME.z(key.size());
      boolean first = true;
      for (final SExpression s : key) {
        final Z e = mInv.getValue(s);
        prod = prod.multiply(p.pow(e.longValueExact() - (first ? 0 : 1)));
        first = false;
        p = mPrime.prevPrime(p);
      }
      return prod;
    }
  };

  @Override
  public Z next() {
    final Z tree = super.next();
    if (tree.isZero()) {
      return Z.ZERO;
    }
    return mInv.getValue(SExpression.binexp2pars(tree)).subtract(1);
  }
}
