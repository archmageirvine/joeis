package irvine.oeis.a288;

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A288580 Array read by upwards antidiagonals: T(n,k) = Product_{ 0 &lt; |n-k*i| &lt;= n} (n-k*i), with n &gt;= 0, k &gt;= 1.
 * @author Georg Fischer
 */
public class A288580 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A288580() {
    super(0, 1, -1);
    hasRAM(true);
  }

  /*
    protected Z compute(final int n, final int k) {
      return super.compute(k, n);
    }
  */
  /* Maple:
T:=proc(n, k)  local i, p;
p:=1;
for i from 0 to floor(2*n/k) do
if n-k*i <> 0 then p:=p*(n-k*i) fi; od:
printf("T[%a,%a]=%a\n", n, k, p);
p
end;
scan1:=proc(a, M1) local lis, n, k; lis:=[]; for n from 1 to M1 do for k from 0 to n-1 do
lis:=[op(lis), a(k, n-k)]; od: od: lis; end:
scan1(T, 12);
*/
  @Override
  public Z matrixElement(int n, int k) {
    if (k == 0) {
      return Z.ONE;
    }
    Z prod = Z.ONE;
    for (int i = 0; i <= 2 * n / k; ++i) {
      if (n - k * i != 0) {
        prod = prod.multiply(n - k * i);
      }
    }
    return prod;
  }
}

