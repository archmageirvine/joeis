package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A067350 Numbers n such that sigma(n)+phi(n) has exactly 4 divisors.
 * @author Sean A. Irvine
 */
public class A067350 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A067350() {
    super(1, new A067349(), Z.FOUR::equals);
  }
}

