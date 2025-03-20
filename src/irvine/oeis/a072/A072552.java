package irvine.oeis.a072;

import irvine.math.nauty.Counter;
import irvine.oeis.a002.A002851;

/**
 * A072552 Number of connected planar regular graphs of degree 4 with n nodes.
 * @author Sean A. Irvine
 */
public class A072552 extends A002851 {

  /** Construct the sequence. */
  public A072552() {
    super(6, () -> Counter.PLANAR);
    skip(6);
  }

  @Override
  protected int degree() {
    return 4;
  }
}
