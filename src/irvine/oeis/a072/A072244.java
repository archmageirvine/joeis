package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A072244 Smallest factorial containing exactly n 4's.
 * @author Sean A. Irvine
 */
public class A072244 extends A072124 {

  /** Construct the sequence. */
  public A072244() {
    super(4);
  }

  @Override
  public Z next() {
    return Functions.FACTORIAL.z(super.next());
  }
}
