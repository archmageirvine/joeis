package irvine.oeis.a085;

import irvine.oeis.InverseSequence;

/**
 * A085764 Least integer m such that between m and 2m there are n palindromes.
 * @author Sean A. Irvine
 */
public class A085764 extends InverseSequence {

  /** Construct the sequence. */
  public A085764() {
    super(1, new A085763());
  }
}
