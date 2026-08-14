package irvine.oeis.a238;

import irvine.math.MemoryFunctionInt3;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;
import irvine.oeis.triangle.DirectArray;

/**
 * A238341 Triangle T(n,k) read by rows: T(n,k) is the number of compositions of n with exactly k occurrences of the largest part, n&gt;=0, 0&lt;=k&lt;=n.
 * @author Georg Fischer
 */
public class A238341 extends BaseTriangle implements DirectArray {

  /** Construct the sequence. */
  public A238341() {
    super(0, 0, 0);
  }

  /* MMA:
     b[n_, p_, i_] := b[n, p, i] = If[n == 0, p!, If[i<1, 0, Sum[b[n-i*j, p+j, i-1]/j!, {j, 0, n/i}]]]; 
     a[n_, k_] := Sum[b[n-i*k, k, i-1]/k!, {i, 1, n/k}]; 
     a[0, 0] = 1; a[_, 0] = 0; Table[a[n, k], {n, 0, 15}, {k, 0, n}]  
  */
  final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int n, final int p, final int i) {
      return (n == 0) ? Functions.FACTORIAL.z(p) : i < 1 ? Z.ZERO : Rationals.SINGLETON.sum(0, n / i, j -> new Q(get(n - i * j, p + j, i - 1), Functions.FACTORIAL.z(j))).num();
    }
  };

  @Override
  public Z triangleElement(final int n, final int k) {
    return n == 0 ? Z.ONE : k == 0 ? Z.ZERO : Rationals.SINGLETON.sum(1, n / k, i -> new Q(mB.get(n - i * k, k, i - 1), Functions.FACTORIAL.z(k))).num();
  }

  @Override
  public Z a(final long n, final long k) {
    return triangleElement((int) n, (int) k);
  }
}
