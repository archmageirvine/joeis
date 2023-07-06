package irvine.oeis.a344;
// manually euleras at 2021-11-24 08:09

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.a000.A000984;

/**
 * A344108 Expansion of Product_{k&gt;=1} 1 / (1 - x^k)^binomial(2*k,k).
 * @author Georg Fischer
 */
public class A344108 extends EulerTransform {

  /** Construct the sequence. */
  public A344108() {
    super(new A000984().skip(1), 1);
  }
}
