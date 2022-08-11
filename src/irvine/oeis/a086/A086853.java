package irvine.oeis.a086;
// manually rectoproc/holos at 2022-08-11 10:22

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A086853 Number of permutations of length n with exactly 2 rising or falling successions.
 * @author Georg Fischer
 */
public class A086853 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A086853() {
    super(0, "[[0],[108,-324, 387,-238, 80,-14, 1],[-338, 903,-929, 477,-130, 18,-1],[-416, 1020,-957, 458,-121, 17,-1],[-348, 155, 275,-273, 98,-16, 1],[384,-608, 376,-114, 17,-1]]", "0, 0, 0, 2, 10", 0);
  }
}
