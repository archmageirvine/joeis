package irvine.oeis.a136;
// manually trecpas/trecpas1

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A136125 Triangle read by rows: T(n,k) is the number of permutations of {1,2,...,n} in which the size of the last cycle is k (the cycles are ordered by increasing smallest elements; 1 &lt;= k &lt;=n).
 * @author Georg Fischer
 */
public class A136125 extends Triangle {

  /** Construct the sequence. */
  public A136125() {
    setOffset(1);
    hasRAM(true);
  }

  /* T:=proc(n, k) if k < n then factorial(n)/(k*(k+1)) elif k = n then factorial(n-1) else 0 end if end proc: */
  @Override
  protected Z compute(int n, int k) {
    ++n;
    ++k;
    return k < n ? MemoryFactorial.SINGLETON.factorial(n).divide(k * (k + 1)) : (k == n ? MemoryFactorial.SINGLETON.factorial(n - 1) : Z.ZERO);
  }
}
