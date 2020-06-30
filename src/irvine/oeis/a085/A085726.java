package irvine.oeis.a085;

import irvine.oeis.SemiprimeSequence;
import irvine.oeis.a000.A000032;

/**
 * A085726 Numbers n such that n-th Lucas number is a semiprime.
 * @author Sean A. Irvine
 */
public class A085726 extends SemiprimeSequence {

  /** Construct the sequence. */
  public A085726() {
    super(new A000032(), 0);
  }
}
