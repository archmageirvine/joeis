package irvine.oeis.a003;

import irvine.math.z.Z;

/**
 * A003928 Order of simple Chevalley group B_n (5).
 * @author Sean A. Irvine
 */
public class A003928 extends A003927 {

  /** Construct the sequence. */
  public A003928() {
    super(1);
  }

  @Override
  protected Z q() {
    return Z.FIVE;
  }

  @Override
  protected int start() {
    return 0;
  }
}
