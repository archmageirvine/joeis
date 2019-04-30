package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a005.A005117;

/**
 * A013929 Numbers that are not squarefree. Numbers that are divisible by a square greater than 1. The complement of A005117.
 * @author Sean A. Irvine
 */
public class A013929 extends ComplementSequence {

  /** Construct the sequence. */
  public A013929() {
    super(new A005117(), Z.FOUR);
  }
}
