package irvine.oeis.a221;

import irvine.oeis.LinearRecurrence;

/**
 * A221639 5^(5n+1) + 4^(5n+2) + 3^(5n).
 * @author Sean A. Irvine
 */
public class A221639 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221639() {
    super(new long[] {777600000, -4208207, 4392}, new long[] {22, 32252, 65664390});
  }
}
