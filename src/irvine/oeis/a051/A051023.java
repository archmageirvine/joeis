package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.WolframAutomata;

/**
 * A051023 Middle column of rule-30 1-D cellular automaton, from a lone 1 cell.
 * @author Sean A. Irvine
 */
public class A051023 extends WolframAutomata {

  /** Construct the sequence. */
  public A051023() {
    super(30);
  }

  private int mN = -1;

  @Override
  public Z next() {
    return super.next().testBit(++mN) ? Z.ONE : Z.ZERO;
  }
}
