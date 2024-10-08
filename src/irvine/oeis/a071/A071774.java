package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a001.A001175;

/**
 * A071774 Related to Pisano periods: integers k such that the period of Fibonacci numbers mod k equals 2*(k+1).
 * @author Sean A. Irvine
 */
public class A071774 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A071774() {
    super(1, 1, new A001175(), (n, k) -> k.equals(Z.valueOf(2L * (n + 1))));
  }
}
