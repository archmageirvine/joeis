package irvine.oeis.a075;

import irvine.oeis.AlternatingSequence;
import irvine.oeis.a005.A005843;
import irvine.oeis.a014.A014076;

/**
 * A075065 a(1) = 1 and then alternately even and odd composite numbers matching the parity of the index.
 * @author Sean A. Irvine
 */
public class A075065 extends AlternatingSequence {

  /** Construct the sequence. */
  public A075065() {
    super(1, new A014076(), new A005843().skip(2));
  }
}

