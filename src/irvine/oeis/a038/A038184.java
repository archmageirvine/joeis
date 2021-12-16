package irvine.oeis.a038;
// manually ca.1m/ca1staged at 2021-12-16 15:45

import irvine.math.z.Z;
import irvine.oeis.ca.Cellular1DAutomaton;

/**
 * A038184 State of one-dimensional cellular automaton &apos;sigma&apos; (Rule 150): 000, 001, 010, 011, 100, 101, 110, 111 -&gt; 0, 1, 1, 0, 1, 0, 0, 1 at generation n, converted to a decimal number.
 * @author Georg Fischer
 */
public class A038184 extends Cellular1DAutomaton {

  /** Construct the sequence. */
  public A038184() {
    super(150);
  }

  @Override
  public Z next() {
    return super.nextStageD();
  }
}
