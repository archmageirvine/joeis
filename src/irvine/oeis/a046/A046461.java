package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.SemiprimeSequence;

/**
 * A046461 Numbers n such that concatenation of numbers from 1 to n is a semiprime.
 * @author Sean A. Irvine
 */
public class A046461 extends SemiprimeSequence {

  private final StringBuilder mS = new StringBuilder();

  /** Construct the sequence. */
  public A046461() {
    super(1);
  }

  @Override
  protected Z candidate(final int n) {
    mS.append(n);
    return new Z(mS);
  }
}
