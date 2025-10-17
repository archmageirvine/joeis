package irvine.oeis.a387;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a052.A052486;
import irvine.oeis.a369.A369361;

/**
 * A387958 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A387958 extends IntersectionSequence {

  /** Construct the sequence. */
  public A387958() {
    super(1, new A052486(), new A369361());
  }
}
