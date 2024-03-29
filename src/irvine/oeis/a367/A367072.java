package irvine.oeis.a367;
// Generated by gen_seq4.pl holos at 2024-02-08 23:00

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A367072 G.f. satisfies A(x) = 1 + x + 2*x^3*A(x)^3.
 * @author Georg Fischer
 */
public class A367072 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A367072() {
    super(0, "[[0], [-2640, 1215, -135], [-4320, 2511, -351], [-1890, 1539, -297], [-162, 243, -81], [0], [-10, -15, 10], [0, 9, 6]]", "1, 1, 0, 2, 6, 6, 14, 60");
  }
}
