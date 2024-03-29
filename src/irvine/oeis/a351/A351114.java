package irvine.oeis.a351;

import irvine.oeis.CharacteristicFunction;
import irvine.oeis.a020.A020492;

/**
 * A351114 Characteristic function of balanced numbers: a(n) = 1 if phi(n) divides sigma(n), otherwise 0.
 * @author Georg Fischer
 */
public class A351114 extends CharacteristicFunction {

  /** Construct the sequence. */
  public A351114() {
    super(1, new A020492());
  }
}
