package irvine.oeis.a072;
// manually 2023-10-12/simtraf at 2023-10-12 09:45

import irvine.math.z.Z;
import irvine.oeis.a033.A033264;

/**
 * A072219 Any number n can be written uniquely in the form n = 2^k_1 - 2^k_2 + 2^k_3 - ... + 2^k_{2r+1} where the signs alternate, there are an odd number of terms, and k_1 &gt; k_2 &gt; k_3 &gt; ... &gt; k_{2r+1} &gt;= 0; sequence gives number of terms 2r+1.
 * @author Georg Fischer
 */
public class A072219 extends A033264 {

  private int mN = 0;

  @Override
  public Z next() {
    return (++mN == 1) ? Z.ONE : super.next().multiply2().add(1);
  }
}
