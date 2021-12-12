package irvine.oeis.a245;

import irvine.math.z.Z;
import irvine.oeis.WolframAutomata;

/**
 * A245549 State of one-dimensional cellular automaton 'sigma' (Rule 30): 000,001,010,011,100,101,110,111 -&gt; 0,0,0,1,1,1,1,0 at generation n, regarded as a binary number.
 * @author Sean A. Irvine
 */
public class A245549 extends WolframAutomata {

  /** Construct the sequence. */
  public A245549() {
    super(30);
  }

  @Override
  public Z next() {
    return new Z(new StringBuilder(super.next().toString(2)).reverse());
  }
}
