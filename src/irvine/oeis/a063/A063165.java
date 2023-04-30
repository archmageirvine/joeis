package irvine.oeis.a063;

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A063166 Dimension of the space of weight 2n cusp forms for Gamma_0( 97 ).
 * @author Sean A. Irvine
 */
public class A063165 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A063165() {
    super(1, "[0,7,24,33,25,8,1]", "[1,0,-1,-1,0,1]");
  }
}
