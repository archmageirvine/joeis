package irvine.oeis.a384;

import irvine.math.turing.AlphabetBusyBeaver;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A384766 Instruction-Limited Symbols Busy Beaver Sequence: Sigma_i(n). Maximum number of non-blank symbols that an n-instruction Turing machine (allowing any number of states and symbols) can leave on an initially blank tape before eventually halting.
 * @author Gregory Morse
 */
public class A384766 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 7) {
      // Regenerate with AlphabetBusyBeaver --instructions 7 --published-count.
      return Z.valueOf(2050);
    }
    return Z.valueOf(AlphabetBusyBeaver.instructionLimited(mN).maximumScore());
  }
}
