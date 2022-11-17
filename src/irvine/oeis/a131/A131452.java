package irvine.oeis.a131;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A131452 a(3n)=4n, a(3n+1)=4n+2, a(3n+2)=4n+1.
 * @author Georg Fischer
 */
public class A131452 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A131452() {
    super(0, "[[0],[-1],[1],[0],[1],[-1]]", "0, 2, 1, 4", 0);
  }
}
