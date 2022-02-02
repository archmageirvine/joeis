package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A055830 Triangle T read by rows: diagonal differences of triangle A037027.
 * @author Georg Fischer
 */
public class A055830 extends Triangle {

  /*
  with(combinat);
  T:= proc(n, k) option remember;
        if k<0 or k>n then 0
      elif k=0 then fibonacci(n+1)
      elif n=1 and k=1 then 0
      else T(n-1, k-1) + T(n-1, k) + T(n-2, k)
        fi; end:
  seq(seq(T(n, k), k=0..n), n=0..12);
  */
  @Override
  public Z compute(final int n, final int k) {
    if (n == 0) {
      return Z.ONE;
    } else if (n == 1) {
      return k == 0 ? Z.ONE : Z.ZERO;
    } else {
      if (k == 0) {
        return get(n - 1, k).add(get(n - 2, k));
      }
      return get(n - 1, k - 1).add(get(n - 1, k)).add(get(n - 2, k));
    }
  }
}
