package irvine.oeis.a390;

import irvine.math.wolfram.TuringMachine;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390016 Maximum halting time across all Wolfram 3-state 2-symbol Turing machines started with n on the tape.
 * @author Sean A. Irvine
 * @author Gregory Morse
 */
public class A390016 extends Sequence1 {

  // Attaining rule tables from the complete machine/input certificate
  // audit, not stored running times. Replay each machine without a cutoff.
  private static final int[] RULES = {
    718804, 670559, 718804, 172204, 670559, 2133803, 666364, 2543572,
    733183, 670559, 665239, 213652, 733183, 670559, 666364, 1999002,
    2727319, 2204791, 733183, 213652, 670559, 173183, 665239, 2543572,
    2727319, 600720, 2143286, 213652, 2675476, 2910079, 666364, 1999002,
    213652, 600720, 2723839, 2375763, 665239, 213609, 2018687, 1999002,
    213652, 600720, 2143286, 213652, 173183, 600720, 589111, 2745402,
    720871, 600720,
  };
  private int mN;

  @Override
  public Z next() {
    if (mN == RULES.length) {
      throw new UnsupportedOperationException("No exact census at input " + (mN + 1));
    }
    final TuringMachine machine = new TuringMachine(RULES[mN], 3, 2);
    machine.initialTape(++mN);
    long steps = 1;
    while (machine.step() >= 0) {
      ++steps;
    }
    return Z.valueOf(steps);
  }
}
