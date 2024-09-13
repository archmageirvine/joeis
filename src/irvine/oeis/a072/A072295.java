package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A072295 Smallest factorial containing exactly n 1's.
 * @author Sean A. Irvine
 */
public class A072295 extends A072124 {

  /** Construct the sequence. */
  public A072295() {
    super(1);
  }

  @Override
  public Z next() {
    return Functions.FACTORIAL.z(super.next());
  }
}
