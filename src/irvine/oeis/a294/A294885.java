package irvine.oeis.a294;

import irvine.math.z.Z;
import irvine.oeis.a004.A004125;

/**
 * A294885 a(n) = A004125(n) mod n = [Sum_{i=1..n} (n mod i)] mod n.
 * @author Georg Fischer
 */
public class A294885 extends A004125 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().mod(Z.valueOf(++mN));
  }
}
