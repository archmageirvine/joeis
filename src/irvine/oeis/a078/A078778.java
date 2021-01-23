package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.SemiprimeSequence;
import irvine.oeis.a000.A000142;

/**
 * A078778 Numbers n such that n!+1 is a semiprime.
 * @author Sean A. Irvine
 */
public class A078778 extends SemiprimeSequence {

  /** Construct the sequence. */
  public A078778() {
    super(new A000142(), 0);
  }

  @Override
  protected Z candidate(final int n) {
    return super.candidate(n).add(1);
  }
}
