package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a033.A033155;

/**
 * A038747 Number of equivalence classes under rotations and reflections of n-step self-avoiding walks on the square lattice having exactly 1 pair of nonconsecutive vertices that are adjacent in the lattice.
 * @author Sean A. Irvine
 */
public class A038747 extends A033155 {

  @Override
  public Z next() {
    return super.next().divide(8);
  }
}
