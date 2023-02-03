package irvine.oeis.a103;
// manually etman at 2023-02-01 21:37

import irvine.oeis.CharacteristicFunction;
import irvine.oeis.a001.A001906;
import irvine.oeis.transform.EulerTransform;

/**
 * A103563 Number of partitions of n into even-subscripted Fibonacci numbers (1,3,8,21,55,144,...).
 * @author Georg Fischer
 */
public class A103563 extends EulerTransform {

  /** Construct the sequence. */
  public A103563() {
    super(0, new CharacteristicFunction(1, new A001906()), 1);
  }
}
