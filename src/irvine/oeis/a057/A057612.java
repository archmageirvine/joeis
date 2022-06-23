package irvine.oeis.a057;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a000.A000959;
import irvine.oeis.a001.A001348;

/**
 * A057612 Numbers that are both Mersenne numbers (A001348) and lucky numbers (A000959).
 * @author Sean A. Irvine
 */
public class A057612 extends IntersectionSequence {

  /** Construct the sequence. */
  public A057612() {
    super(new A001348(), new A000959());
  }
}
