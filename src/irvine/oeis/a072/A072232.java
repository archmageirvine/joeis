package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A072232 Smallest factorial containing exactly n 9's.
 * @author Sean A. Irvine
 */
public class A072232 extends A072124 {

  /** Construct the sequence. */
  public A072232() {
    super(9);
  }

  @Override
  public Z next() {
    return Functions.FACTORIAL.z(super.next());
  }
}
