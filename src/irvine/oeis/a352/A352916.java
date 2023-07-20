package irvine.oeis.a352;
// manually holom/holos at 2023-07-20 14:24

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A352916 a(n) = A025179(n-2) + A102839(n-4), for n &gt;= 4, with a(0) = a(2) = 0 and a(1) = a(3) = 1.
 * @author Georg Fischer
 */
public class A352916 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A352916() {
    super(0, "[[0],[2160,-864, 84],[2820,-859, 47],[-312, 356,-37],[-513, 221, 1],[69,-70, 1]]", "[0, 1, 0, 1, 1, 5]", 0);
  }
}
