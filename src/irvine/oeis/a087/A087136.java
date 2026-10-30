package irvine.oeis.a087;

import irvine.oeis.InverseSequence;
import irvine.oeis.a073.A073642;

/**
 * A087136 Smallest positive number m such that A073642(m)=n.
 * @author Sean A. Irvine
 */
public class A087136 extends InverseSequence {

  /** Construct the sequence. */
  public A087136() {
    super(0, 0, new A073642().skip(), 1);
  }
}
