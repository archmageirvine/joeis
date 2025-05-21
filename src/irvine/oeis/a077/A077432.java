package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A077432 Squares of the form u'v'w, where in decimal representation u=n^2, v=2*n^2 and w=n^2 possibly with a leading zero.
 * @author Sean A. Irvine
 */
public class A077432 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A077432() {
    super(1, new A077431(), Z::square);
  }
}
