package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a173.A173380;

/**
 * A038746 Number of equivalence classes under rotations and reflections of non-straight n-step self-avoiding walks on the square lattice having no pair of nonconsecutive vertices that are adjacent in the lattice.
 * @author Sean A. Irvine
 */
public class A038746 extends A173380 {

  /** Construct the sequence. */
  public A038746() {
    super(1);
  }

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(4).divide(8);
  }
}
