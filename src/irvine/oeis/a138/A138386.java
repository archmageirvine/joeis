package irvine.oeis.a138;
// manually etman at 2023-02-01 22:30

import irvine.oeis.SkipSequence;
import irvine.oeis.a001.A001429;
import irvine.oeis.transform.EulerTransform;

/**
 * A138386 The initial values of the m-th row of table T of A137918 as m tends to infinity.
 * @author Georg Fischer
 */
public class A138386 extends EulerTransform {

  /** Construct the sequence. */
  public A138386() {
    super(0, new SkipSequence(new A001429(), 1), 1);
  }
}
