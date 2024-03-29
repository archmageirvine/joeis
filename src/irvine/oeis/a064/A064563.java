package irvine.oeis.a064;
// Generated by gen_seq4.pl build/parm4 at 2023-02-21 22:23

import irvine.math.z.Z;
/**
 * A064563 Reciprocal of n terminates with an infinite repetition of digit 4. Multiples of 10 are omitted.
 * @author Georg Fischer
 */
public class A064563 extends A064560 {

  /** Construct the sequence. */
  public A064563() {
    super(1, i -> Z.ONE.shiftLeft(6L * i - 2).multiply(Z.NINE), i -> Z.FIVE.pow(6L * i - 4).multiply(Z.NINE));
  }
}
