package irvine.oeis.a120;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A120594 G.f. satisfies: 8*A(x) = 7 + 8*x + A(x)^4, starting with [1,2,6].
 * @author Georg Fischer
 */
public class A120594 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A120594() {
    super(0, "[[0],[-7280, 9312,-3840, 512],[-10472, 15988,-8064, 1344],[-3528, 7644,-5292, 1176],[0,-178, 267,-89]]", "[1, 2, 6]", 0);
  }
}
