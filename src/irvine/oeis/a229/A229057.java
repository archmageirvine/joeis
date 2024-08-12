package irvine.oeis.a229;

import irvine.oeis.InverseSequence;
import irvine.oeis.a013.A013631;

/**
 * A229057 First occurrences of n in the continued fraction of zeta(3).
 * @author Sean A. Irvine
 */
public class A229057 extends InverseSequence {

  /** Construct the sequence. */
  public A229057() {
    super(new A013631());
  }
}
