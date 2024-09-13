package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A072242 Smallest factorial containing exactly n 5's.
 * @author Sean A. Irvine
 */
public class A072242 extends A072124 {

  /** Construct the sequence. */
  public A072242() {
    super(5);
  }

  @Override
  public Z next() {
    return Functions.FACTORIAL.z(super.next());
  }
}
