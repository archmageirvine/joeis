package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A072145.
 * @author Sean A. Irvine
 */
public class A072240 extends A072124 {

  /** Construct the sequence. */
  public A072240() {
    super(6);
  }

  @Override
  public Z next() {
    return Functions.FACTORIAL.z(super.next());
  }
}
