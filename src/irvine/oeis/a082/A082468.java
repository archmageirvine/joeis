package irvine.oeis.a082;

import irvine.oeis.InverseSequence;

/**
 * A082468 a(n) is the smallest positive integer k such that A082467(k)=n.
 * @author Sean A. Irvine
 */
public class A082468 extends InverseSequence {

  /** Construct the sequence. */
  public A082468() {
    super(1, 1, new A082467());
  }
}

