package irvine.oeis.a212;
// Generated by gen_seq4.pl A211422/parmof3 at 2022-02-02 22:53

import irvine.oeis.a210.A210286;

/**
 * A212102 Number of (w,x,y,z) with all terms in {1,...,n} and 1/w=1/x+1/y+1/z.
 * @author Georg Fischer
 */
public class A212102 extends A210286 {

  /** Construct the sequence. */
  public A212102() {
    super(0, n -> new Long[] {1L, n}, (n, w, x, y, z) -> x * y * z == w * (y * z + x * z + x * y));
  }
}
