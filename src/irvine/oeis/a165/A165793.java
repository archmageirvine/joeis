package irvine.oeis.a165;
// manually
import irvine.oeis.HolonomicRecurrence;

/**
 * A165793 a(0)=1, a(n)=n*(a(n-1)-2).
 * @author Georg Fischer
 */
public class A165793 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A165793() {
    super(0, "[[0,-2],[0, 1],[-1]]", "[1]", 0);
  }
}
