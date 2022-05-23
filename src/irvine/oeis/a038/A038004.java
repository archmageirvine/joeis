package irvine.oeis.a038;

import irvine.oeis.InverseSequence;
import irvine.oeis.a033.A033178;

/**
 * A038004 Least k such that A033178(k)=n.
 * @author Sean A. Irvine
 */
public class A038004 extends InverseSequence {

  /** Construct the sequence. */
  public A038004() {
    super(new A033178(), 1, 2);
  }
}
