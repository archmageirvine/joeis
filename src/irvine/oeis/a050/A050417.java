package irvine.oeis.a050;

import irvine.oeis.InverseSequence;

/**
 * A050417 Least k such that A050416(k) = n.
 * @author Sean A. Irvine
 */
public class A050417 extends InverseSequence {

  /** Construct the sequence. */
  public A050417() {
    super(new A050416());
  }
}
