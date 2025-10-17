package irvine.oeis.a387;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a131.A131605;
import irvine.oeis.a369.A369361;

/**
 * A387620 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A387620 extends IntersectionSequence {

  /** Construct the sequence. */
  public A387620() {
    super(1, new A131605(), new A369361());
  }
}
