package irvine.oeis.a384;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a014.A014574;
import irvine.oeis.a055.A055932;

/**
 * A384530 Intersection of A055932 and A014574.
 * @author Sean A. Irvine
 */
public class A384530 extends IntersectionSequence {

  /** Construct the sequence. */
  public A384530() {
    super(1, new A055932(), new A014574());
  }
}
