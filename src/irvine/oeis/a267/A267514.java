package irvine.oeis.a267;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.WolframAutomata;

/**
 * A267514 Binary representation of the middle column of the "Rule 137" elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A267514 implements Sequence {

  private final StringBuilder mA = new StringBuilder();
  private final WolframAutomata mAutomata = new WolframAutomata(137);
  private int mN = -1;

  @Override
  public Z next() {
    final Z a = mAutomata.next();
    mA.append(a.testBit(++mN) ? '1' : '0');
    return new Z(mA);
  }
}
