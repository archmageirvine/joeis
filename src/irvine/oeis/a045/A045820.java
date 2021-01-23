package irvine.oeis.a045;
// manually 2020-11-28 

import irvine.math.z.Z;

/**
 * A045820 Theta series of D8 lattice with respect to midpoint of edge.
 * @author Georg Fischer
 */
public class A045820 extends A045822 {

  @Override
  public Z next() {
    return super.next().multiply2();
  }

}
