package irvine.oeis.a026;

import irvine.oeis.InverseSequence;

/**
 * A026195 a(n) = position of n in A026194.
 * @author Sean A. Irvine
 */
public class A026195 extends InverseSequence {

  /** Construct the sequence. */
  public A026195() {
    super(new A026194());
  }
}
