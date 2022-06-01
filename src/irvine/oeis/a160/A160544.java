package irvine.oeis.a160;
// manually
import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A160544 Not divisible by 19.
 * @author Georg Fischer
 */
public class A160544 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A160544() {
    super(1, "[[0],[1],[-1],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[-1],[1]]", 
                  "[1,   2,  3,  4,  5,  6,  7,  8,  9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 20, 21]",  0);
  }
}
