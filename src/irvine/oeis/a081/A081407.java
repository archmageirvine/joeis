package irvine.oeis.a081;
// manually 

import irvine.oeis.HolonomicRecurrence;

/**
 * A081407 4th-order non-linear ("factorial") recursion: a(0)=a(1)=a(2)=a(3)=1, a(n) = (n+1)*a(n-4).
 * @author Georg Fischer
 */
public class A081407 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A081407() {
    super(0, "[[0],[1, 1],[0],[0],[0],[-1]]", "[1, 1, 1, 1]", 0);
  }
}
