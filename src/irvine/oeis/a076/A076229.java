package irvine.oeis.a076;

import irvine.oeis.InverseSequence;

/**
 * A076229 Smallest number such that A076228(a(n)) = n.
 * @author Sean A. Irvine
 */
public class A076229 extends InverseSequence {

  /** Construct the sequence. */
  public A076229() {
    super(1, new A076228());
  }
}
