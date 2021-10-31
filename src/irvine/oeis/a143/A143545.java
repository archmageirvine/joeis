package irvine.oeis.a143;

import irvine.math.z.Z;
import irvine.oeis.a010.A010051;

/**
 * A143545 a(n) = n unless n is a prime, in which case a(n) = 2n.
 * @author Georg Fischer
 */
public class A143545 extends A010051 {

  protected long mN;
  
  /** Construct the sequence. */
  public A143545() {
    mN = 0;
  }

  @Override
  public Z next() {
    ++mN;
    return super.next().add(1).multiply(mN);
  }
}
