package irvine.oeis.a110;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A110397 a(n) = (10^k - n)(10^k + n), where k is the number of digits in n.
 * @author Georg Fischer
 */
public class A110397 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z k10 = Z.TEN.pow(String.valueOf(mN).length());
    return k10.subtract(mN).multiply(k10.add(mN));
  }
}
