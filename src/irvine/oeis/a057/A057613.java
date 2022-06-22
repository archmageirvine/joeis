package irvine.oeis.a057;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a000.A000225;
import irvine.oeis.a000.A000959;

/**
 * A057613 Numbers that are both lucky numbers (A000959) and of form 2^k-1 (A000225).
 * @author Sean A. Irvine
 */
public class A057613 extends IntersectionSequence {

  /** Construct the sequence. */
  public A057613() {
    super(new A000225(), new A000959());
  }
}
