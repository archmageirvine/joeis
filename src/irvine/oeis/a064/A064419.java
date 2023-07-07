package irvine.oeis.a064;

/**
 * A064419 a(n) = n for n &lt;= 5; for n &gt; 5, a(n) = smallest number not already used such that gcd(a(n), a(n-1)) &gt;= 5.
 * @author Sean A. Irvine
 */
public class A064419 extends A064417 {

  /** Construct the sequence. */
  public A064419() {
    super(5);
  }
}
