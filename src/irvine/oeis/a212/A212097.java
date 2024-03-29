package irvine.oeis.a212;
// Generated by gen_seq4.pl A211422/parmof3 at 2022-02-02 22:53

import irvine.oeis.a210.A210286;

/**
 * A212097 Number of (w,x,y,z) with all terms in {1,...,n} and w^3&lt;x^3+y^3+z^3.
 * @author Georg Fischer
 */
public class A212097 extends A210286 {

  /** Construct the sequence. */
  public A212097() {
    super(0, n -> new Long[] {1L, n}, (n, w, x, y, z) -> w * w * w < x * x * x + y * y * y + z * z * z);
  }
}
