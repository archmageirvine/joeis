package irvine.oeis.a279;
// manually 2022-11-29

import irvine.oeis.CharacteristicFunction;
import irvine.oeis.a006.A006564;
import irvine.oeis.transform.EulerTransform;

/**
 * A279758 Expansion of Product_{k&gt;=1} 1/(1 - x^(k*(5*k^2-5*k+2)/2)).
 * @author Georg Fischer
 */
public class A279758 extends EulerTransform {

  /** Construct the sequence. */
  public A279758() {
    super(new CharacteristicFunction(1, new A006564(), true, 4), 1);
  }
}
