package irvine.oeis.a086;

import irvine.oeis.InverseSequence;

/**
 * A086957 Smallest m with A086956(m)=n.
 * @author Sean A. Irvine
 */
public class A086957 extends InverseSequence {

  /** Construct the sequence. */
  public A086957() {
    super(1, new A086956());
  }
}


