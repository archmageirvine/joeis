package irvine.oeis.a260;
// manually bisect 2021-08-18

import irvine.math.z.Z;
import irvine.oeis.a033.A033509;

/**
 * A260035 Number of configurations of the general monomer-dimer model for a 6 X 2n square lattice.
 * @author Georg Fischer
 */
public class A260035 extends A033509 {

  @Override
  public Z next() {
    final Z result = super.next();
    super.next();
    return result;
  }
}
