package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A075850 Greatest k such that f(k,1) divides f(k,n) where f(k,n) is the k-th term of the sequence : f(1,n)=1 f(2,n)= n f(k+2,n)=f(k+1,n)+f(k,n) (f(k,1) is the Fibonacci sequence).
 * @author Sean A. Irvine
 */
public class A075850 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    Z a = Z.ONE;
    Z b = Z.valueOf(++mN);

    long best = 1;
    for (long k = 2; k <= mN * best; ++k) {
      final Z f = Functions.FIBONACCI.z(k);
      if (b.mod(f).isZero()) {
        best = k;
      }
      final Z t = a.add(b);
      a = b;
      b = t;
    }
    return Z.valueOf(best);
  }
}

