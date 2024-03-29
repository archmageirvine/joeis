package irvine.oeis.a061;
// Generated by gen_seq4.pl dersimple at 2021-08-21 22:23

import irvine.math.z.Z;
import irvine.oeis.a004.A004201;

/**
 * A061885 n + largest triangular number less than or equal to n.
 * @author Georg Fischer
 */
public class A061885 extends A004201 {

  /** Construct the sequence. */
  public A061885() {
    super(0);
  }

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
