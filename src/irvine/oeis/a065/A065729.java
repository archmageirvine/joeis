package irvine.oeis.a065;

import irvine.oeis.SemiprimeSequence;
import irvine.oeis.a000.A000041;

/**
 * A065729 n-th partition number <code>(A000041(n))</code> is a semiprime.
 * @author Sean A. Irvine
 */
public class A065729 extends SemiprimeSequence {

  /** Construct the sequence. */
  public A065729() {
    super(new A000041(), 0);
  }
}
