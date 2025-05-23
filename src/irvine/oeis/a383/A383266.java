package irvine.oeis.a383;
// Generated by gen_seq4.pl 2025-04-28.ack/trilambn at 2025-04-28 23:36

import irvine.math.z.Z;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A383266 Triangle read by rows: For n, k &gt;= 2 T(n, k) is defined as the exponent of the highest power e of k such that k^e &lt;= n. Otherwise T(n, 0) = n^2 and T(n, 1) = n.
 * @author Georg Fischer
 */
public class A383266 extends LambdaTriangle {

  /** Construct the sequence. */
  public A383266() {
    super(0, 0, 0, (n, k) -> {
      if (k == 0) {
        return Z.valueOf(n).multiply(n);
      } else if (k == 1) {
        return Z.valueOf(n);
      } else {
        int e = 0;
        int pk = 1;
        while (pk <= n) {
          ++e;
          pk *= k;
        }
        return Z.valueOf(e - 1);
      }
    });
  }
}
