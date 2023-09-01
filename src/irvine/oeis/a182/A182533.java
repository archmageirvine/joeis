package irvine.oeis.a182;

import irvine.math.z.Z;
import irvine.oeis.a230.A230206;

/**
 * A182533 A symmetrical triangle. Read by rows: T(n,k) = 2*C(n-2,k-1) - C(n-2,k) - C(n-2,k-2), n &gt;= 2, 0 &lt;= k &lt;= n, with T(0,0) = 0, T(1,0) = T(1,1) = 1.
 * @author Georg Fischer
 */
public class A182533 extends A230206 {

  private int mN = 0;

  /** Construct the sequence. */
  public A182533() {
    super(1, 2);
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 1) {
      return Z.ZERO;
    }
    if (mN <= 3) {
      return Z.ONE;
    }
    return super.next().negate();
  }
}
