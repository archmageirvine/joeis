package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a102.A102342;

/**
 * A068677 Numbers that yield a prime when a 7 is prefixed or suffixed to them.
 * @author Sean A. Irvine
 */
public class A068677 extends FilterSequence {

  /** Construct the sequence. */
  public A068677() {
    super(1, new A102342(), k -> new Z("7" + k).isProbablePrime());
  }
}
