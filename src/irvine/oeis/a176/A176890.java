package irvine.oeis.a176;

import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A176890 Triangle T(n,k) read by rows. Signed subsequence of A051731.
 * T(n,k) = if n=1 and k=1 then -1 elseif n=k then 0 elseif k divides n then 1 else 0.
 * @author Georg Fischer
 */
public class A176890 extends BaseTriangle {

  /** Construct the sequence. */
  public A176890() {
    super(1, 1, 1);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return (n == 1) ? Z.NEG_ONE : ((k == n) ? Z.ZERO : ((n % k == 0) ? Z.ONE : Z.ZERO));
  }
}
