package irvine.oeis.a120;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A120599 G.f. satisfies: 13*A(x) = 12 + 32*x + A(x)^5, starting with [1,4,20].
 * @author Georg Fischer
 */
public class A120599 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A120599() {
    // holdfin(A123, 0, algtorec((-13*A+12+32*x+A^5)/8,A,x,n,A),[1, 4, 20, 280],"a(n)");
    super(0, "[[0],[-591360, 1280000, 7040000, 6400000, 1600000],[6120000, 21000000, 25680000, 13200000, 2400000],[10530000, 26595000, 24165000, 9450000, 1350000],[5062500, 11306250, 8775000, 2868750, 337500],[-354504,-738550,-516985,-147710,-14771]]", "[1, 4, 20, 280]", 4);
  }
}
