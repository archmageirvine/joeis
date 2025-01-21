package irvine.oeis.a074;

import irvine.oeis.InverseSequence;

/**
 * A074390 a(n) is the least number k that A074389(k) = n.
 * @author Sean A. Irvine
 */
public class A074390 extends InverseSequence {

  /** Construct the sequence. */
  public A074390() {
    super(1, new A074389(), 1);
  }
}
