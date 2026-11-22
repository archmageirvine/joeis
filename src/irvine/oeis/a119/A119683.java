package irvine.oeis.a119;

import irvine.math.turing.BlankTapeHalting;
import irvine.math.z.Z;
import irvine.oeis.a004.A004147;

/**
 * A119683 Maximal number of steps that an n-state Turing machine can make which was started on an initially blank tape before halting on the blank tape again.
 * @author Gregory Morse
 */
public class A119683 extends A004147 {
  // Five-state shortcut checked by the internal BusyBeaver verifier.
  /** Construct the sequence. */
  public A119683() {
    super(187);
  }

  @Override
  protected Z select(final BlankTapeHalting tally) {
    return Z.valueOf(tally.cleanMaximum());
  }
}
