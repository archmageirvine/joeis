package irvine.oeis.a174;
// manually 2021-06-24

import irvine.math.z.Z;
import irvine.oeis.a038.A038759;

/**
 * A174803 a(n) = n + ceiling(sqrt(n))*floor(sqrt(n)).
 * @author Georg Fischer
 */
public class A174803 extends A038759 {

  protected int mN = -1;
  @Override
  public Z next() {
    ++mN;
    return super.next().add(Z.valueOf(mN));
  } // next
}
