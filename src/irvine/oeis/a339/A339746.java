package irvine.oeis.a339;
// Generated by gen_seq4.pl 2024-09-20.ack/parmof3 at 2024-09-20 18:07

import irvine.oeis.a329.A329963;
import irvine.oeis.a372.A372573;

/**
 * A339746 Positive integers of the form 2^i*3^j*k, gcd(k,6)=1, and i == j (mod 3).
 * @author Georg Fischer
 */
public class A339746 extends A329963 {

  /** Construct the sequence. */
  public A339746() {
    super(1, 1, new A372573());
  }
}
