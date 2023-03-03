package irvine.oeis.a275;
// manually knestm/knest at 2023-03-02 16:06

import irvine.math.z.Z;
import irvine.oeis.a054.A054247;

/**
 * A275798 One half of the number of n X n square grids with squares of two colors modulo operations of the dihedral group D_4.
 * @author Georg Fischer
 */
public class A275798 extends A054247 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
