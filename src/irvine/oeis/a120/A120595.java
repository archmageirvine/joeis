package irvine.oeis.a120;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A120595 G.f. satisfies: 13*A(x) = 12 + 27*x + A(x)^4, starting with [1,3,6].
 * @author Georg Fischer
 */
public class A120595 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A120595() {
    super(0, "[[0],[-98280, 125712,-51840, 6912],[-71808, 109632,-55296, 9216],[-12288, 26624,-18432, 4096],[0,-902, 1353,-451]]", "[1, 3, 6]", 0);
  }
}
