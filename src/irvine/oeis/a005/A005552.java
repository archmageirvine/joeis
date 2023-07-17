package irvine.oeis.a005;

import irvine.oeis.a003.A003290;

/**
 * A005552 Number of n-step self-avoiding walks on hexagonal lattice from (0,0) to (1,3).
 * @author Sean A. Irvine
 */
public class A005552 extends A003290 {

  /** Construct the sequence. */
  public A005552() {
    super(4);
  }

  @Override
  protected int first() {
    return 4;
  }

  @Override
  protected long search() {
    return search(0, 0, 7, 1, mN, 1);
  }

}
