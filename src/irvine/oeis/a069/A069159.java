package irvine.oeis.a069;

import irvine.oeis.AlternatingSumSequence;
import irvine.oeis.a000.A000796;

/**
 * A069159 a(n) = d(1) - d(2) + d(3) - d(4) + ... + (-1)^(n+1) d(n), where d(k) denotes the k-th term of the digit sequence 3, 1, 4, 1, 5, 9,.... of Pi.
 * @author Sean A. Irvine
 */
public class A069159 extends AlternatingSumSequence {

  /** Construct the sequence. */
  public A069159() {
    super(1, new A000796());
  }
}

