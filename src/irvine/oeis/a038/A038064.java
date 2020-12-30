package irvine.oeis.a038;
// manually 2020-12-30

import irvine.oeis.InverseEulerTransform;
import irvine.oeis.a169.A169585;

/**
 * A038064 Product_{k&gt;=1} 1/(1 - x^k)^a(k) = 1 + 3x.
 * @author Georg Fischer
 */
public class A038064 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A038064() {
    super(new A169585(), 1);
    next();
  }
}
