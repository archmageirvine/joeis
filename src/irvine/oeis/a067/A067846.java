package irvine.oeis.a067;

import irvine.oeis.InverseSequence;

/**
 * A067846 Least m such that A067513(m) = n.
 * @author Sean A. Irvine
 */
public class A067846 extends InverseSequence {

  /** Construct the sequence. */
  public A067846() {
    super(1, new A067513(), 1);
  }
}
