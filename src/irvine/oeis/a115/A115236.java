package irvine.oeis.a115;

import irvine.oeis.a003.A003983;
import irvine.oeis.triangle.Inverse;

/**
 * A115236 Matrix inverse of triangle A003983.
 * @author Georg Fischer
 */
public class A115236 extends Inverse {

  /** Construct the sequence. */
  public A115236() {
    super(new A003983());
  }
}
