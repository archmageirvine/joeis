package irvine.oeis.a299;

import irvine.oeis.a022.A022424;

/**
 * A299416 Solution <code>a( )</code> of the complementary equation <code>a(n) = b(n-1) + b(n-2)</code>, where <code>a(0) = 3, a(1) = 4</code>; see Comments.
 * @author Sean A. Irvine
 */
public class A299416 extends A022424 {

  /** Construct the sequence. */
  public A299416() {
    super(3, 4);
  }
}
