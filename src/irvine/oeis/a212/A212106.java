package irvine.oeis.a212;
// Generated by gen_seq4.pl A211422/parmof3 at 2022-02-02 22:53

import irvine.oeis.a210.A210286;

/**
 * A212106 Number of (w,x,y,z) with all terms in {1,...,n} and w &lt; harmonic mean of {x,y,z}.
 * @author Georg Fischer
 */
public class A212106 extends A210286 {

  /** Construct the sequence. */
  public A212106() {
    super(0, n -> new Long[] {1L, n}, (n, w, x, y, z) -> w * (y * z + x * z + x * y) < 3 * x * y * z);
  }
}
