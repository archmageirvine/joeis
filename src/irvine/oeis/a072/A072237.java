package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A072145.
 * @author Sean A. Irvine
 */
public class A072237 extends A072124 {

  /** Construct the sequence. */
  public A072237() {
    super(8);
  }

  @Override
  public Z next() {
    return Functions.FACTORIAL.z(super.next());
  }
}
