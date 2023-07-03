package irvine.oeis.a048;

import irvine.oeis.InverseSequence;

/**
 * A048826 a(n) = least k such that A048825(k) = n.
 * @author Sean A. Irvine
 */
public class A048826 extends InverseSequence {

  /** Construct the sequence. */
  public A048826() {
    super(0, new A048825(), 0, 2);
  }
}
