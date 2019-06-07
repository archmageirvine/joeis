package irvine.oeis.a046;

import irvine.oeis.FiniteSequence;

/**
 * A046043 Autobiographical numbers (or curious <code>numbers)</code>: numbers <code>n = x0 x1 x2...x9</code> such that xi is the number of digits equal to i in <code>n</code>.
 * @author Georg Fischer
 */
public class A046043 extends FiniteSequence {

  /** Construct the sequence. */
  public A046043() {
    super(1210, 2020, 21200, 3211000, 42101000, 521001000L, 6210001000L);
  }
}
