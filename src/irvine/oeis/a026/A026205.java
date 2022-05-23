package irvine.oeis.a026;

import irvine.oeis.InverseSequence;

/**
 * A026205 a(n) = position of n in A026204.
 * @author Sean A. Irvine
 */
public class A026205 extends InverseSequence {

  /** Construct the sequence. */
  public A026205() {
    super(new A026204());
  }
}
