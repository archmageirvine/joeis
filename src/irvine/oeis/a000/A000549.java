package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.IntersectionSequence;
import irvine.oeis.a001.A001481;

/**
 * A000549 Numbers that are the sum of 2 squares but not sum of 3 nonzero squares.
 * @author Sean A. Irvine
 */
public class A000549 extends IntersectionSequence {

  /** Default constructor. */
  public A000549() {
    super(new A001481(), new ComplementSequence(new A000408(), Z.ONE));
  }
}
