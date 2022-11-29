package irvine.oeis.a279;
// manually 2022-11-29

import irvine.oeis.CharacteristicFunction;
import irvine.oeis.a006.A006564;
import irvine.oeis.transform.EulerTransform;

/**
 * A279758 Number of partitions of n into nonzero tetrahedral numbers.
 * @author Georg Fischer
 */
public class A279758 extends EulerTransform {

  /** Construct the sequence. */
  public A279758() {
    super(new CharacteristicFunction(1, new A006564(), true, 4), 1);
  }
}
