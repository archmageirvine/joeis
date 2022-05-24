package irvine.oeis.a280;

import irvine.math.z.Z;
import irvine.oeis.a057.A057889;

/**
 * A280508 a(n) = n XOR A057889(n).
 * @author Georg Fischer
 */
public class A280508 extends A057889 {

  private int mN = -1;

  @Override
  public Z next() {
    return super.next().xor(Z.valueOf(++mN));
  }
}
