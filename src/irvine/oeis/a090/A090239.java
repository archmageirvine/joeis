package irvine.oeis.a090;

import irvine.math.z.Z;
import irvine.oeis.a053.A053838;

/**
 * A090239 a(n) = A053838(n) + 2 modulo 3.
 * @author Georg Fischer
 */
public class A090239 extends A053838 {

  /** Construct the sequence. */
  public A090239() {
  }

  @Override
  public Z next() {
    return super.next().add(2).mod(Z.THREE);
  }
}
