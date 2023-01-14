package irvine.oeis.a122;
// manually 2023-01-13; eulerxfm 1 at 2020-08-17 18:03

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.transform.EulerTransform;


/**
 * A122779 Expansion of F(q)*F(q^5) where F(q) = eta(q^2)*eta(q^3)^3 / (eta(q)*eta(q^6)).
 * @author Georg Fischer
 */
public class A122779 extends EulerTransform {

  /** Construct the sequence. */
  public A122779() {
    super(1, new PeriodicSequence(1, 0, -2, 0, 2, -2, 1, 0, -2, 0, 1, -2, 1, 0, -4, 0, 1, -2, 1, 0, -2, 0, 1, -2, 2, 0, -2, 0, 1, -4), 1);
  }
}
