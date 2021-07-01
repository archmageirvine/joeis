package irvine.oeis.a267;

import irvine.oeis.WolframAutomata;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

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
    System.out.println("a=" + a.toString(2));
    mA.append(a.testBit(++mN) ? '1' : '0');
    return new Z(mA);
  }
}
