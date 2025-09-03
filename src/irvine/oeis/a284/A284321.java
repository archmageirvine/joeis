package irvine.oeis.a284;
// manually at 2025-09-03

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A284321 Expansion of Product_{k&gt;=0} (1 - x^(5*k+1))*(1 - x^(5*k+4)) in powers of x.
 * @author Georg Fischer
 */
public class A284321 extends EulerTransform {

  /** Construct the sequence. */
  public A284321() {
    super(new PeriodicSequence(-1, 0, 0, -1, 0), 1);
  }
}
