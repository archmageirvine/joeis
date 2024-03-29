package irvine.oeis.a116;
// Generated by gen_seq4.pl tritoep

import irvine.oeis.recur.HolonomicRecurrence;
import irvine.oeis.triangle.ToeplitzTriangle;

/**
 * A116949 Riordan array ((1-x^3)/(1+2x^2),x).
 * @author Georg Fischer
 */
public class A116949 extends ToeplitzTriangle {

  /** Construct the sequence. */
  public A116949() {
    super(0, new HolonomicRecurrence(0, "[[0],[-2],[0],[-1]]", "1,0,-2,-1", 0));
  }
}

