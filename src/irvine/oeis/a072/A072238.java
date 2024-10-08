package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A072238 Smallest factorial containing exactly n 7's.
 * @author Sean A. Irvine
 */
public class A072238 extends A072124 {

  /** Construct the sequence. */
  public A072238() {
    super(7);
  }

  @Override
  public Z next() {
    return Functions.FACTORIAL.z(super.next());
  }
}
