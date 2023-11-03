package irvine.oeis.a143;

import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A143199 Triangle read by rows: T(n, m) =  if m &lt;= floor(n/2) then (n + 1)*a(m) + n otherwise (n + 1)*a(n - m) + n, where a(m) is A000096.
 * t(n,m)=If[m &lt;= Floor[n/2], (n + 1)*a[m] + n, (n + 1)*a[n - m] + n].
 * @author Georg Fischer
 */
public class A143199 extends BaseTriangle {

  /** Construct the sequence. */
  public A143199() {
    super(0, 0, 0);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int m) {
    // Maple: seq(print(seq((n + 1) * (if m <= n/2 then (m - 1) * (m + 2) / 2 else (n - m + 2) * (n - (m + 1)) / 2 fi) + n, m=0..n)), n=0..10);
    return Z.valueOf(n + 1).multiply(m <= n / 2 ? (m - 1) * (m + 2) / 2 : (n - m + 2) * (n - m - 1) / 2).add(n);
  }
}
