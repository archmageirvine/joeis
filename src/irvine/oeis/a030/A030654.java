package irvine.oeis.a030;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A030654 n^4*a(n) is the number of spheres in complex projective space tangent to 4 smooth surfaces of degree n in general position.
 * @author Sean A. Irvine
 */
public class A030654 extends LinearRecurrence {

  /** Construct the sequence. */
  public A030654() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {8, 497, 9352, 81473, 451976, 1863793, 6230792, 17817857, 45159688});
  }
}
