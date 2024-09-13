package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A072269 Smallest factorial containing exactly n 3's.
 * @author Sean A. Irvine
 */
public class A072269 extends A072124 {

  /** Construct the sequence. */
  public A072269() {
    super(3);
  }

  @Override
  public Z next() {
    return Functions.FACTORIAL.z(super.next());
  }
}
