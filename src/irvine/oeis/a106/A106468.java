package irvine.oeis.a106;
// manually 2026-08-04/trinv at 2026-08-04 06:27

import irvine.math.z.Z;
import irvine.oeis.triangle.Inverse;

/**
 * A106468 Absolute value of inverse of number triangle A106465.
 * @author Georg Fischer
 */
public class A106468 extends Inverse {

  /** Construct the sequence. */
  public A106468() {
    super(0, new A106465());
  }

  @Override
  public Z next() {
    return super.next().abs();
  }
}
