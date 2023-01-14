package irvine.oeis.a276;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A276491 Expansion of q*Product_{k&gt;=1} (1-q^(2*k))^2*(1-q^(10*k))^2.
 * @author Georg Fischer
 */
public class A276491 extends EulerTransform {

  /** Construct the sequence. */
  public A276491() {
    super(1, new PeriodicSequence(0, -2, 0, -2, 0, -2, 0, -2, 0, -4), 1);
  }
}
