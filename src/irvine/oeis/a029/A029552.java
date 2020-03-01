package irvine.oeis.a029;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A029552 Expansion of <code>phi(x) / f(-x)</code> in powers of x where <code>phi(), f()</code> are Ramanujan theta functions.
 * @author Sean A. Irvine
 */
public class A029552 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A029552() {
    super(new PeriodicSequence(3, -2, 3, 0), 0);
  }
}
