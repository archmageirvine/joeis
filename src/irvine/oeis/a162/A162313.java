package irvine.oeis.a162;
// manually 2026-08-04/trinv at 2026-08-04 06:27

import irvine.math.z.Z;
import irvine.oeis.triangle.Inverse;

/**
 * A162313 Triangular array P*(2*I - P^2)^-1, where P is Pascal's triangle A007318 and I is the identity matrix.
 * @author Georg Fischer
 */
public class A162313 extends Inverse {

  /** Construct the sequence. */
  public A162313() {
    super(0, new A162315());
  }

  @Override
  public Z next() {
    return super.next().abs();
  }
}
