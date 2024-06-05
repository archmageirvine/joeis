package irvine.oeis.a121;

import irvine.math.z.Z;
import irvine.oeis.a070.A070250;

/**
 * A070250.
 * @author Sean A. Irvine
 */
public class A121476 extends A070250 {

  /** Construct the sequence. */
  public A121476() {
    super(9);
  }

  @Override
  protected boolean accept(final Z t) {
    return true;
  }
}
