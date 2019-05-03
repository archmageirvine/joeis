package irvine.oeis.a011;

import irvine.oeis.PeriodicSequence;

/**
 * A011658 Period <code>5</code>: repeat <code>[0, 0, 0, 1, 1]</code>; also expansion of <code>1/(x^4 + x^3 + x^2 + x + 1) (mod 2)</code>.
 * @author Sean A. Irvine
 */
public class A011658 extends PeriodicSequence {

  /** Construct the sequence. */
  public A011658() {
    super(0, 0, 0, 1, 1);
  }
}
