package irvine.oeis.a067;

/**
 * A067354 Numbers n such that prime(n+2)-(n+2)*tau(n+2)=prime(n-2)-(n-2)*tau(n-2) where tau(n) is the number of divisors of n A000005(n).
 * @author Sean A. Irvine
 */
public class A067354 extends A067355 {

  /** Construct the sequence. */
  public A067354() {
    super(-2, 2);
  }
}

