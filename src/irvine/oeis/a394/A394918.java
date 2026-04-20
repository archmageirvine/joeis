package irvine.oeis.a394;

import irvine.oeis.InverseSequence;

/**
 * A394918 Least integer k such that A394475(k) = n.
 * @author Sean A. Irvine
 */
public class A394918 extends InverseSequence {

  /** Construct the sequence. */
  public A394918() {
    super(1, new A394475());
  }
}
