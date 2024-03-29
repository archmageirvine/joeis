package irvine.oeis.a367;
// Generated by gen_seq4.pl holos at 2024-02-08 23:00

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A367029 G.f. satisfies A(x) = 1 + x*A(x) - x^2*A(x)^4.
 * @author Georg Fischer
 */
public class A367029 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A367029() {
    super(0, "[[0], [3315, -2013, 405, -27], [-7995, 4695, -891, 54], [21546, -14666, 3234, -229], [6570, -10378, 4650, -620], [-441, 499, 201, -229], [45, -165, 81, 54], [0, 12, 0, -27]]", "1, 1, 0, -4, -10, 2, 89, 249");
  }
}
