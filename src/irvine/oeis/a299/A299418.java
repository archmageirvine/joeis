package irvine.oeis.a299;

import irvine.oeis.a022.A022424;

/**
 * A299418 Solution <code>a( )</code> of the complementary equation <code>a(n) = b(n-1) + b(n-2)</code>, where <code>a(0) = 3, a(1) = 5</code>; see Comments.
 * @author Sean A. Irvine
 */
public class A299418 extends A022424 {

  /** Construct the sequence. */
  public A299418() {
    super(3, 5);
  }
}
