package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A072293 Smallest factorial containing exactly n 2's.
 * @author Sean A. Irvine
 */
public class A072293 extends A072124 {

  /** Construct the sequence. */
  public A072293() {
    super(2);
  }

  @Override
  public Z next() {
    return Functions.FACTORIAL.z(super.next());
  }
}
