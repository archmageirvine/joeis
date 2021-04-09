package irvine.oeis.a046;

import irvine.oeis.SemiprimeSequence;
import irvine.oeis.a000.A000042;

/**
 * A046413 Numbers n such that the repunit of length n (11...11, with n 1's) has exactly 2 prime factors.
 * @author Sean A. Irvine
 */
public class A046413 extends SemiprimeSequence {

  /** Construct the sequence. */
  public A046413() {
    super(new A000042(), 1);
  }
}
