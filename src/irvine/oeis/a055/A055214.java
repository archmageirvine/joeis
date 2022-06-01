package irvine.oeis.a055;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A055214 a(0) = 1; a(n) = 2*n*a(n-1) - 1 for n &gt;= 1.
 * @author Georg Fischer
 */
public class A055214 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A055214() {
    super(0, "[[-1],[0, 2],[-1]", "1", 0);
  }
}
