package irvine.oeis.a384;

import irvine.math.turing.AlphabetBusyBeaver;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A384629 Instruction-Limited Busy Beaver Sequence: BBi(n). Maximum number of steps that an n-instruction Turing machine (allowing any number of states and symbols) can take on an initially blank tape before eventually halting.
 * @author Gregory Morse
 */
public class A384629 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 7) {
      // Regenerate with AlphabetBusyBeaver --instructions 7 --published-count.
      return Z.valueOf(3932963);
    }
    return Z.valueOf(AlphabetBusyBeaver.instructionLimited(mN).maximumSteps());
  }
}
