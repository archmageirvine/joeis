package irvine.oeis.a059;

import irvine.math.cr.CR;
import irvine.oeis.EngelExpansionSequence;

/**
 * A059184 Engel expansion of 1/log(10) = 0.434294....
 * @author Georg Fischer
 */
public class A059184 extends EngelExpansionSequence {

  /** Construct the sequence. */
  public A059184() {
    super(CR.LOG10.inverse());
  }
}
