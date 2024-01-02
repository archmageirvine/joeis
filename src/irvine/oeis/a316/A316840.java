package irvine.oeis.a316;
// manually filtpos at 2023-09-24 22:35

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a254.A254990;

/**
 * A316840 Indices of 3's in A254990.
 * @author Georg Fischer
 */
public class A316840 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A316840() {
    super(1, 0, new A254990(), v -> v.equals(Z.THREE));
  }
}
