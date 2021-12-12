package irvine.oeis.a038;
// manually 2020-12-30

import irvine.oeis.transform.InverseEulerTransform;
import irvine.oeis.a130.A130706;

/**
 * A038063 Product_{k&gt;=1}1/(1 - x^k)^a(k) = 1 + 2x.
 * @author Georg Fischer
 */
public class A038063 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A038063() {
    super(new A130706(), 1);
    next();
  }
}
