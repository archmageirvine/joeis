package irvine.oeis.a062;

/**
 * A062094 a(1) = 2, a(n) = concatenation of two closest factors of a(n-1) whose product equals a(n-1) or if a(n-1) is a prime then the concatenation of 1 and a(n-1).
 * @author Sean A. Irvine
 */
public class A062094 extends A062095 {

  /** Construct the sequence. */
  public A062094() {
    super(2);
  }
}
