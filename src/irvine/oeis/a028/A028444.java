package irvine.oeis.a028;

import irvine.math.turing.BlankTapeHalting;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A028444 Busy Beaver sequence, or Rado's sigma function: maximal number of 1's that an n-state Turing machine can print on an initially blank tape before halting.
 * @author Sean A. Irvine
 * @author Gregory Morse
 */
public class A028444 extends LambdaSequence {

  /** Construct the sequence. */
  public A028444() {
    super(0, n -> {
      if (n == 0) {
        return Z.ZERO;
      }
      if (n >= 1 && n <= 4) {
        return Z.valueOf(BlankTapeHalting.smallTally(n.intValue()).maximumScore());
      }
      if (n == 5) {
        // Expensive fifth term checked by the internal BusyBeaver verifier.
        return Z.valueOf(4098);
      }
      throw new UnsupportedOperationException("No further exact terms known");
    });
  }
}
