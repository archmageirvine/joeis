package irvine.oeis.a045;

import irvine.oeis.SkipSequence;
import irvine.oeis.a004.A004729;

/**
 * A045544 Odd values of n for which a regular n-gon can be constructed by compass and straightedge.
 * @author Sean A. Irvine
 */
public class A045544 extends SkipSequence {

  /** Construct the sequence. */
  public A045544() {
    super(new A004729(), 1);
  }
}
