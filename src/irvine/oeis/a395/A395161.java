package irvine.oeis.a395;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a394.A394225;

/**
 * A395161 k is a term if and only if, in the process described at A394915, there are no new point-like intersections after step k.
 * @author Sean A. Irvine
 */
public class A395161 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A395161() {
    super(1, new A394225(), ZERO);
  }
}
