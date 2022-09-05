package irvine.oeis.a058;

import irvine.oeis.InverseSequence;
import irvine.oeis.a037.A037478;

/**
 * A058913 Smallest number k such that x/(sum of digits of x) = k has exactly n solutions.
 * @author Sean A. Irvine
 */
public class A058913 extends InverseSequence {

  /** Construct the sequence. */
  public A058913() {
    super(new A037478(), 0);
  }
}
