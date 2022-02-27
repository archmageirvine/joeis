package irvine.oeis.a054;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a000.A000566;
import irvine.oeis.a002.A002113;

/**
 * A054910 Palindromic heptagonal numbers.
 * @author Sean A. Irvine
 */
public class A054910 extends IntersectionSequence {

  /** Construct the sequence. */
  public A054910() {
    super(new A002113(), new A000566());
  }
}
