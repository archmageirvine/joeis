package irvine.oeis.a039;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a006.A006093;

/**
 * A039915 Smallest k such that k(p-1)-1 is positive and divisible by p where p = n-th prime.
 * @author Sean A. Irvine
 */
public class A039915 extends PrependSequence {

  /** Construct the sequence. */
  public A039915() {
    super(1, new SkipSequence(new A006093(), 1), 3);
  }
}
