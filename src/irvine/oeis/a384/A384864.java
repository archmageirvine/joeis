package irvine.oeis.a384;
// manually 2026-01-10

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunctionInt2Sequence;
import irvine.oeis.triangle.DirectArray;

/**
 * A384864 Square array A(n,k), n &gt;= 0, k &gt;= 0, read by antidiagonals downwards, where column k is the expansion of B(x)^k, where B(x) is the g.f. of A213091.
 * where B(x) is the g.f. of A213091.
 * @author Georg Fischer
 */
public class A384864 extends MemoryFunctionInt2Sequence<Q> implements DirectArray {

  private final int mA; // first parameter
  private final int mB; // second parameter
  private final int mC; // third parameter
  private int mN; // row index
  private int mM; // columns index

  /** Construct the sequence. */
  public A384864() {
    this(0, -2, 3, 1);
  }

  /**
   * Generic constructor with parameters.
   * @param a first parameter
   * @param b second parameter
   * @param c third parameter
   * @param  offset first index
   */
  public A384864(final int offset, final int a, final int b, final int c) {
    super(offset);
    mN = offset - 1;
    mM = offset;
    mA = a;
    mB = b;
    mC = c;
  }

  @Override
  protected Q compute(final int n, final int k) {
    if (n * k == 0) {
      //* System.err.println("        n=" + n + "\tk=" + k + "\t0^n=" + (n == 0 ? Z.ONE : Z.ZERO));
      return n == 0 ? Q.ONE : Q.ZERO;
    }
    Q sum = Q.ZERO;
    for (int j = 1; j <= n; ++j) {
      final Z sbin = Functions.BINOMIAL.z(mA * n + mB * j + k - 1, j - 1);
      final Q sget = get(n - j, mC * j);
      //* System.err.println("    n=" + n + "\tk=" + k + "\tj=" + j + "\tp1=" + (mA*n + mB*j + k - 1) + "\tbinomial(p1, j-1)=" + (sbin) + "\tsget=" + sget);
      sum = sum.add(sget.multiply(sbin).divide(j));
    }
    final Q result = sum.multiply((n & 1) == 0 ? k : -k);
    //* System.err.println("    n=" + n + "\tk=" + k + "\tcompute(" + n + ", " + k + ") = " + result);
    return result;
  }

  protected Q t(final int n, final int m) {
    //* System.err.println("a(" + n + ", " + m + ") = " + get(n, -m) + "\n----");
    return get(n, -m);
  }

  @Override
  public Z a(final int n, final int k) {
    return t(n, k).num();
  }

  @Override
  public Z next() {
    if (--mM < 0) {
      ++mN;
      mM = mN;
    }
    return t(mN - mM, mM).num();
  }
/* (PARI)
A384864:
b(n, k) = if(n*k==0, print("        n=", n, "\tk=", k, "\t0^n=", 0^n); 0^n, (-1)^n*k*sum(j=1, n, sbin = binomial(-2*n+3*j+k-1, j-1); sget = b(n-j, j); print("    n=", n, "\tk=",k,"\tj=", j, "\tp1=", (-2*n+3*j+k-1), "\tbinomial(p1, j-1)=", sbin, "\tsget=", sget); sbin*b(n-j, j)/j));
a(n, k) = b(n, -k);
for (n=0, 5, forstep(k=n, 0, -1, print("a(",(n - k), ",", k, ")=", a(n-k, k), "\n----")))

A384865:
b(n, k) = if(n*k==0, 0^n, (-1)^n*k*sum(j=1, n, sbin = binomial(-3*n+4*j+k-1, j-1)*b(n-j, j)/j));
a(n, k) = b(n, -k);
for (n=0, 8, for(k=0, 8, print1(a(n, k),", ")); print)

*/
}
