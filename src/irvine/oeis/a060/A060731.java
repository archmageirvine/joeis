package irvine.oeis.a060;

/**
 * A060731 a(n) = a(n-1) + a(n - 1 minus the number of terms of a(k) == (mod 4) so far).
 * @author Sean A. Irvine
 */
public class A060731 extends A060730 {

  /** Construct the sequence. */
  public A060731() {
    super(4);
  }
}
