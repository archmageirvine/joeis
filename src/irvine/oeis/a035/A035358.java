package irvine.oeis.a035;

import irvine.oeis.InverseSequence;

/**
 * A035358 k such that A035312(k-1) = n or 0 if there is none.
 * @author Sean A. Irvine
 */
public class A035358 extends InverseSequence {

  /** Construct the sequence. */
  public A035358() {
    super(new A035312());
  }
}

