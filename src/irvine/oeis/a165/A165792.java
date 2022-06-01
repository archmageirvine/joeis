package irvine.oeis.a165;
// manually
import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A165792 a(0)=1, a(n) = n*(a(n-1)+2).
 * @author Georg Fischer
 */
public class A165792 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A165792() {
    super(0, "[[0, 2],[0, 1],[-1]]", "[1]", 0);
  }
}
