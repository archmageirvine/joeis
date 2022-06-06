package irvine.oeis.a120;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A120593 G.f. satisfies: 5*A(x) = 4 + x + A(x)^4, starting with [1,1,6].
 * @author Georg Fischer
 */
public class A120593 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A120593() {
    super(0, "[[0],[-3640, 4656,-1920, 256],[-23936, 36544,-18432, 3072],[-36864, 79872,-55296, 12288],[0,-982, 1473,-491]]", "1, 1, 6", 0);
  }
}
