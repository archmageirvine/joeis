package irvine.oeis.a280;

import irvine.oeis.CharacteristicFunction;
import irvine.oeis.a007.A007598;
import irvine.oeis.transform.EulerTransform;

/**
 * A280168 Expansion of Product_{k&gt;=2} 1/(1 - x^(Fibonacci(k)^2)).
 * @author Georg Fischer
 */
public class A280168 extends EulerTransform {

  /** Construct the sequence. */
  public A280168() {
    super(new CharacteristicFunction(new A007598()), 1);
  }
}
