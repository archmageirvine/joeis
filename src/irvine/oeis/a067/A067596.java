package irvine.oeis.a067;

import irvine.oeis.CharacteristicFunction;
import irvine.oeis.a006.A006995;
import irvine.oeis.transform.EulerTransform;

/**
 * A067596 Number of partitions of n into palindrome parts in base 2.
 * @author Sean A. Irvine
 */
public class A067596 extends EulerTransform {

  /** Construct the sequence. */
  public A067596() {
    super(new CharacteristicFunction(1, new A006995(), true, 4), 1);
  }
}
