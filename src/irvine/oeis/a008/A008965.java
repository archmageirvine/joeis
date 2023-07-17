package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a000.A000031;

/**
 * A008965 Number of necklaces of sets of beads containing a total of n beads.
 * @author Sean A. Irvine
 */
public class A008965 extends A000031 {

  /** Construct the sequence. */
  public A008965() {
    super(1);
  }

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
