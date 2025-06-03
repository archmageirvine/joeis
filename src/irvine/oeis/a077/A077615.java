package irvine.oeis.a077;

import irvine.oeis.InverseSequence;

/**
 * A077615 a(n) is least k such that A077614(k)=n or 0 if there is none.
 * @author Sean A. Irvine
 */
public class A077615 extends InverseSequence {

  /** Construct the sequence. */
  public A077615() {
    super(1, new A077614());
  }
}
