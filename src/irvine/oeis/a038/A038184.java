package irvine.oeis.a038;

import irvine.math.WolframAutomata;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038184 State of one-dimensional cellular automaton 'sigma' (Rule 150): 000,001,010,011,100,101,110,111 -&gt; 0,1,1,0,1,0,0,1 at generation n, converted to a decimal number.
 * @author Sean A. Irvine
 */
public class A038184 implements Sequence {

  private final WolframAutomata mAutomata = new WolframAutomata(150);

  @Override
  public Z next() {
    final Z res = mAutomata.toZ();
    mAutomata.next();
    return res;
  }
}
