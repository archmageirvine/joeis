package irvine.oeis.a137;
// manually 2026-09-26/filtpos at 2026-09-26 23: 24

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a067.A067581;

/**
 * A137857 Fixed points of A067581.
 * @author Georg Fischer
 */
public class A137857 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A137857() {
    super(1, 0, new A067581(), (k, v) -> v.equals(Z.valueOf(k)));
    next();
  }
}
