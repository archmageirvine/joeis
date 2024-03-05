package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a102.A102700;

/**
 * A068678 Numbers that yield a prime when a 9 is prefixed or suffixed to them.
 * @author Sean A. Irvine
 */
public class A068678 extends FilterSequence {

  /** Construct the sequence. */
  public A068678() {
    super(1, new A102700(), k -> new Z("9" + k).isProbablePrime());
  }
}
