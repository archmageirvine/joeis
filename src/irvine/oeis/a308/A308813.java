package irvine.oeis.a308;
// Generated by gen_seq4.pl 2024-01-25/triuple at 2024-01-26 22:29

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A308813 Square array A(n,k), n &gt;= 1, k &gt;= 0, read by antidiagonals downwards, where A(n,k) is Sum_{d|n} k^(d-1).
 * @author Georg Fischer
 */
public class A308813 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A308813() {
    super(1, 1, 0, -1);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return Integers.SINGLETON.sumdiv(n, d -> Z.valueOf(k).pow(d - 1));
  }
}
