package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A072419 Smallest factorial containing exactly n 0's, or 0 if no such factorial exists.
 * @author Sean A. Irvine
 */
public class A072419 extends A072124 {

  /** Construct the sequence. */
  public A072419() {
    super(0);
  }

  @Override
  public Z next() {
    final Z t = super.next();
    return t.isZero() ? t : Functions.FACTORIAL.z(t);
  }
}
