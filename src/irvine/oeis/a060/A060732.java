package irvine.oeis.a060;

/**
 * A060732 a(n) = a(n-1) + a(n - 1 minus the number of terms of a(k) == (mod 5) so far).
 * @author Sean A. Irvine
 */
public class A060732 extends A060730 {

  /** Construct the sequence. */
  public A060732() {
    super(5);
  }
}
