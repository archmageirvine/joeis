package irvine.oeis.a067;

/**
 * A067354 Numbers k such that prime(k+2)-(k+2)*tau(k+2) = prime(k-2)-(k-2)*tau(k-2) where tau(k) = A000005(k) is the number of divisors of k.
 * @author Sean A. Irvine
 */
public class A067354 extends A067355 {

  /** Construct the sequence. */
  public A067354() {
    super(-2, 2);
  }
}

