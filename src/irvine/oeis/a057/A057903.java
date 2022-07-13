package irvine.oeis.a057;

import irvine.oeis.UnionSequence;
import irvine.oeis.a000.A000578;
import irvine.oeis.a022.A022555;

/**
 * A057903 Positive integers that are not the sum of exactly two positive cubes.
 * @author Sean A. Irvine
 */
public class A057903 extends UnionSequence {

  /** Construct the sequence. */
  public A057903() {
    super(new A022555(), new A000578());
    next();
  }
}
