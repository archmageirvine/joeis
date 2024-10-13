package irvine.oeis.a001;

import irvine.oeis.a006.A006613;

/**
 * A001197 Zarankiewicz's problem k_2(n).
 * @author Sean A. Irvine
 */
public class A001197 extends A006613 {

  /** Construct the sequence. */
  public A001197() {
    super(2);
  }

  @Override
  protected int j() {
    return 2;
  }
}

