package irvine.oeis.a080;
// manually A074476/parm3

import irvine.oeis.a074.A074477;

/**
 * A080798 Largest prime factor of 3^n-2.
 * @author Georg Fischer
 */
public class A080798 extends A074477 {

  /** Construct the sequence. */
  public A080798() {
    super(3, -2);
    next();
  }
}
