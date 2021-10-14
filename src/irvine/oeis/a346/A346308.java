package irvine.oeis.a346;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a001.A001951;
import irvine.oeis.a022.A022838;

/**
 * A346308 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A346308 extends IntersectionSequence {

  /** Construct the sequence. */
  public A346308() {
    super(new A001951(), new A022838());
  }
}
