package irvine.oeis.a060;

/**
 * A060733 a(n) = a(n-1) + a(n - 1 minus the number of terms of a(k) == (mod 6) so far).
 * @author Sean A. Irvine
 */
public class A060733 extends A060730 {

  /** Construct the sequence. */
  public A060733() {
    super(6);
  }
}
