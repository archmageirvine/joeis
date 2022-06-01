package irvine.oeis.a056;
// manually 

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A056543 a(n) = n*a(n-1) - 1 with a(1)=1.
 * @author Georg Fischer
 */
public class A056543 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A056543() {
    super(1, "[[-1],[0, 1],[-1]]", "[1]", 0);
  }
}
