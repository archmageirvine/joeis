package irvine.oeis.a280;

import irvine.oeis.CharacteristicFunction;
import irvine.oeis.a006.A006882;
import irvine.oeis.transform.EulerTransform;

/**
 * A280241 Expansion of Product_{k&gt;=1} 1/(1 - x^(k!!)).
 * @author Georg Fischer
 */
public class A280241 extends EulerTransform {

  /** Construct the sequence. */
  public A280241() {
    super(new CharacteristicFunction(new A006882()), 1);
  }
}
