package irvine.oeis.a064;

import irvine.oeis.InverseSequence;
import irvine.oeis.a063.A063993;

/**
 * A064181 Smallest number that can be written in n ways as an unordered sum of 3 nonzero triangular numbers.
 * @author Sean A. Irvine
 */
public class A064181 extends InverseSequence {

  /** Construct the sequence. */
  public A064181() {
    super(0, new A063993(), 0, 0);
  }
}
