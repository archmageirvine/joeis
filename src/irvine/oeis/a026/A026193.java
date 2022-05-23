package irvine.oeis.a026;

import irvine.oeis.InverseSequence;

/**
 * A026193 a(n) = position of n in A026192.
 * @author Sean A. Irvine
 */
public class A026193 extends InverseSequence {

  /** Construct the sequence. */
  public A026193() {
    super(new A026192());
  }
}
