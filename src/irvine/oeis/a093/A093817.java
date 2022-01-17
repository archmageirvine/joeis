package irvine.oeis.a093;
// manually A074476/parm3

import irvine.oeis.a074.A074477;

/**
 * A093817 Largest prime factor of 2^n-3.
 * @author Georg Fischer
 */
public class A093817 extends A074477 {

  /** Construct the sequence. */
  public A093817() {
    super(2, -3);
    next();
  }
}
