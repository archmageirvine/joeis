package irvine.oeis.a098;
// Generated by gen_seq4.pl A060205/parm2 at 2022-03-26 22:06

import irvine.math.z.Z;
import irvine.oeis.a060.A060205;

/**
 * A098104 Numbers of the form 7^p - p^7 where p is prime.
 * @author Georg Fischer
 */
public class A098104 extends A060205 {

  /** Construct the sequence. */
  public A098104() {
    super(p -> Z.SEVEN.pow(p).subtract(Z.valueOf(p).pow(7)));
  }
}
