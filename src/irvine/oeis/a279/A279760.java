package irvine.oeis.a279;

import irvine.oeis.CharacteristicFunction;
import irvine.oeis.a030.A030078;
import irvine.oeis.transform.EulerTransform;

/**
 * A279760 Expansion of Product_{k&gt;=1} 1/(1 - x^(prime(k)^3)).
 * @author Georg Fischer
 */
public class A279760 extends EulerTransform {

  /** Construct the sequence. */
  public A279760() {
    super(new CharacteristicFunction(new A030078()), 1);
  }
}
