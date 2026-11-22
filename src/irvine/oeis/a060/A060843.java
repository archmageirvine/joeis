package irvine.oeis.a060;

import irvine.math.turing.BlankTapeHalting;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A060843 Busy Beaver problem: a(n) is the maximal number of steps that an n-state Turing machine can make on an initially blank tape before eventually halting.
 * @author Sean A. Irvine
 * @author Gregory Morse
 */
public class A060843 extends LambdaSequence {

  /** Construct the sequence. */
  public A060843() {
    super(1, n -> {
      if (n >= 1 && n <= 4) {
        return Z.valueOf(BlankTapeHalting.smallTally(n.intValue()).maximumSteps());
      }
      if (n == 5) {
        // Expensive fifth term checked by the internal BusyBeaver verifier.
        return Z.valueOf(47176870);
      }
      throw new UnsupportedOperationException("No further exact terms known");
    });
  }
}
