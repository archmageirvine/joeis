package irvine.oeis.a322;
// Generated by gen_seq4.pl 2025-05-11.ack/arrlamb at 2025-05-11 22:56

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.triangle.LambdaArray;

/**
 * A322143 Square array A(n,k), n &gt;= 1, k &gt;= 0, read by antidiagonals: A(n,k) = Sum_{d|n, d==1 (mod 4)} d^k - Sum_{d|n, d==3 (mod 4)} d^k.
 * @author Georg Fischer
 */
public class A322143 extends LambdaArray {

  /** Construct the sequence. */
  public A322143() {
    super(1, 1, 1, -1, (n, k) -> Integers.SINGLETON.sumdiv(n, d -> d % 4 == 1 ? Z.valueOf(d).pow(k - 1) : Z.ZERO).subtract(Integers.SINGLETON.sumdiv(n, d -> d % 4 == 3 ? Z.valueOf(d).pow(k - 1) : Z.ZERO)));
  }
}
