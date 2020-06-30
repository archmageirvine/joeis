package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.SemiprimeSequence;
import irvine.oeis.a000.A000142;

/**
 * A078781 Numbers n such that <code>n!-1</code> is a semiprime.
 * @author Sean A. Irvine
 */
public class A078781 extends SemiprimeSequence {

  /** Construct the sequence. */
  public A078781() {
    super(new A000142(), 0);
  }

  @Override
  protected Z candidate(final int n) {
    return super.candidate(n).subtract(1);
  }
}
