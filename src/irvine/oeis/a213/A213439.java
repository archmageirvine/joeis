package irvine.oeis.a213;
// manually divmul at 2021-08-20 23:36

import irvine.math.z.Z;
import irvine.oeis.a000.A000136;

/**
 * A213439 A000136(n)/2.
 * @author Georg Fischer
 */
public class A213439 extends A000136 {

  /** Construct the sequence */
  public A213439() {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide(2);
  }
}
