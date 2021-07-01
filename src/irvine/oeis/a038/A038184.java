package irvine.oeis.a038;

import irvine.oeis.WolframAutomata;

/**
 * A038184 State of one-dimensional cellular automaton 'sigma' (Rule 150): 000,001,010,011,100,101,110,111 -&gt; 0,1,1,0,1,0,0,1 at generation n, converted to a decimal number.
 * @author Sean A. Irvine
 */
public class A038184 extends WolframAutomata {

  /** Construct the sequence. */
  public A038184() {
    super(150);
  }
}
