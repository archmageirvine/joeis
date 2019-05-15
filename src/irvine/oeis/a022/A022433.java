package irvine.oeis.a022;

/**
 * A022433 <code>a(n) = c(n-1) + c(n-3)</code> where c is the sequence of numbers not in a.
 * @author Sean A. Irvine
 */
public class A022433 extends A022427 {

  /** Construct the sequence. */
  public A022433() {
    super(1, 3, 5);
  }
}
