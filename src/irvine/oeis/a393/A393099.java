package irvine.oeis.a393;

import irvine.oeis.gf.GfSequence;

/**
 * A393099 Number of 4-stack polyominoes having semiperimeter equal to n.
 * @author Sean A. Irvine
 */
public class A393099 extends GfSequence {

  /** Construct the sequence. */
  public A393099() {
    super(2, "x^2*(1-3*x)^2/((1-2*x)*(1-4*x)^(3/2))");
  }
}
