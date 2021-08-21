package irvine.oeis.a050;

import irvine.oeis.ComplementSequence;
import irvine.oeis.a007.A007298;

/**
 * A050939 Numbers that are not the sum of consecutive Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A050939 extends ComplementSequence {

  /** Construct the sequence. */
  public A050939() {
    super(new A007298());
  }
}
