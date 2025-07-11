package irvine.oeis.a361;
// Generated by gen_seq4.pl 2025-06-15.ack/filtpos at 2025-06-15 21:33

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A361464 Numbers k such that A135504(k+1) / A135504(k) is a multiple of 4.
 * @author Georg Fischer
 */
public class A361464 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A361464() {
    super(1, 1, new A361462(), v -> v.equals(Z.THREE));
  }
}
