package irvine.oeis.a088;

import irvine.math.z.Z;
import irvine.oeis.a001.A001358;

/**
 * A088707 Semiprimes + 1.
 * @author Georg Fischer
 */
public class A088707 extends A001358 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
