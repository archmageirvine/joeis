package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091981 Poincar&#233; series [or Poincare series] (or Molien series) for <code>GL_2(4):2</code>.
 * @author Sean A. Irvine
 */
public class A091981 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091981() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 1, -1, 0, 0, 1, -1, 0, 1, -1, 0, 0, 0, -1, 1, 0, -1, 1, 0, 0, -1, 1, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 0, 0, 0, 0, 0, 1, 0, 2, 1, 1, 1, 3, 1, 3, 3, 4, 3, 5, 3, 7, 6, 7, 8, 12, 8, 12, 12, 14, 14, 18, 15, 22, 20, 22, 24});
  }
}
