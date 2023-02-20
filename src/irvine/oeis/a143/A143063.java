package irvine.oeis.a143;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a027.A027348;

/**
 * A143063 Expansion of the product of a false theta function and a Ramanujan theta function in powers of x.
 * @author Georg Fischer
 */
public class A143063 extends Sequence0 {

  private int mN = -1;
  private final A027348 mSeq = new A027348();

  @Override
  public Z next() {
    return (++mN == 0) ? Z.ONE : mSeq.next().multiply2();
  }
}
