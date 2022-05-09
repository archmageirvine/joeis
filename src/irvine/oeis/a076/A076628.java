package irvine.oeis.a076;
// manually tricol/parm2 at 2022-05-08 16:03

import irvine.oeis.a225.A225163;

/**
 * A076628 a(n) = 2^(2^(n-1))*b(n) where b(1) = 1/2 and b(n+1) = b(n) - b(n)^2.
 * @author Georg Fischer
 */
public class A076628 extends A225163 {

  /** Construct the sequence. */
  public A076628() {
    super(2);
  }
}
