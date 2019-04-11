package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087420 <code>a(n)</code> is the sum of the squares of the sizes of the conjugacy classes in the dihedral group D_2n.
 * @author Sean A. Irvine
 */
public class A087420 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087420() {
    super(new long[] {1, 0, -3, 0, 3, 0}, new long[] {2, 4, 14, 14, 34, 28});
  }
}
