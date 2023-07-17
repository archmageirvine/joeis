package irvine.oeis.a003;

import irvine.math.z.Z;

/**
 * A003923 Order of universal Chevalley group B_n (2) or symplectic group Sp(2n,2).
 * @author Sean A. Irvine
 */
public class A003923 extends A003920 {

  /** Construct the sequence. */
  public A003923() {
    super(0);
  }

  @Override
  protected Z q() {
    return Z.TWO;
  }

  @Override
  protected int start() {
    return -1;
  }
}
