package irvine.oeis.a193;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A193653 Q-residue of the Delannoy triangle A008288, where Q is the triangular array (t(i,j)) given by t(i,j)=1.
 * @author Sean A. Irvine
 */
public class A193653 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193653() {
    super(new long[] {-2, -1, 4}, new long[] {1, 2, 6});
  }
}
