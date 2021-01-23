package irvine.oeis.a037;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a007.A007953;

/**
 * A037123 a(n) = a(n-1) + sum of digits of n.
 * @author Sean A. Irvine
 */
public class A037123 extends PartialSumSequence {

  /** Construct the sequence. */
  public A037123() {
    super(new A007953());
  }
}
