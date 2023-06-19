package irvine.oeis.a296;
// manually deris2/essent at 2021-11-04

import irvine.oeis.PrependSequence;
import irvine.oeis.a038.A038156;

/**
 * A296964 Expansion of (x*exp(x)-1)/(1-x).
 * Essentially the same as A038156. - _R. J. Mathar_, Jan 02 2018
 * @author Georg Fischer
 */
public class A296964 extends PrependSequence {

  /** Construct the sequence. */
  public A296964() {
    super(new A038156().skip(2), 0, 1);
  }
}
