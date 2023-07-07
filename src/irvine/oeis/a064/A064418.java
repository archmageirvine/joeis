package irvine.oeis.a064;

/**
 * A064418 a(1) = 1, a(2) = 2, a(3) = 3, a(4) = 4; for n &gt; 4, a(n) = smallest number not already used such that gcd(a(n), a(n-1)) &gt;= 4.
 * @author Sean A. Irvine
 */
public class A064418 extends A064417 {

  /** Construct the sequence. */
  public A064418() {
    super(4);
  }
}
