package irvine.oeis.a071;

import irvine.math.z.InverseEuler;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A071624 Numbers n such that the set InvPhi[96n+2] is nonempty.
 * @author Georg Fischer
 */
public class A071624 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A071624() {
    super(1, 0, n -> !InverseEuler.inversePhi(Z.valueOf(96L * n + 2)).isEmpty());
  }
}
