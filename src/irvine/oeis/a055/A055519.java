package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055519 <code>a_{k+1} = 9*a_k + 33*a_{k-1} - 76*a_{k-2} - 33*a_{k-3} + 9*a_{k-4} + a_{k-5}, a_1=1, a_2=2, a_3=35, a_4=312, a_5=3779, a_6=41590</code>.
 * @author Sean A. Irvine
 */
public class A055519 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055519() {
    super(new long[] {1, 9, -33, -76, 33, 9}, new long[] {1, 2, 35, 312, 3779, 41590});
  }
}
