package irvine.oeis.a160;
// manually
import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A160547 Numbers coprime to 31.
 * @author Georg Fischer
 */
public class A160547 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A160547() {
    super(1, "[[0],[1],[-1],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[-1],[1]]", 
                  "[ 1,   2,  3,  4,  5,  6,  7,  8,  9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 32, 33]", 0);
  }
}
