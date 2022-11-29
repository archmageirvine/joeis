package irvine.oeis.a290;
// manually 2022-11-29

import irvine.oeis.CharacteristicFunction;
import irvine.oeis.SkipSequence;
import irvine.oeis.a002.A002415;
import irvine.oeis.transform.EulerTransform;

/**
 * A290792 Expansion of Product_{k&gt;=1} 1/(1 - x^(k*(k+1)^2*(k+2)/12)).
 * @author Georg Fischer
 */
public class A290792 extends EulerTransform {

  /** Construct the sequence. */
  public A290792() {
    super(new CharacteristicFunction(1, new SkipSequence(new A002415(), 1), true, 4), 1);
  }
}
