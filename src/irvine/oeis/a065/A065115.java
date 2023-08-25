package irvine.oeis.a065;

import irvine.oeis.InverseSequence;
import irvine.oeis.a010.A010340;

/**
 * A065115 Least k such that the sum of terms in period of continued fraction for sqrt(k) is n.
 * @author Sean A. Irvine
 */
public class A065115 extends InverseSequence {

  /** Construct the sequence. */
  public A065115() {
    super(2, new A010340(), 2);
  }
}
