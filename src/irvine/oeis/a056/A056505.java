package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a285.A285012;

/**
 * A056505 Number of periodic palindromic structures using a maximum of four different symbols.
 * @author Sean A. Irvine
 */
public class A056505 extends A285012 {

  /** Construct the sequence. */
  public A056505() {
    super(0);
  }

  private int mN = -1;

  @Override
  public Z next() {
    return t(++mN, 4).add(t(mN, 3)).add(t(mN, 2)).add(t(mN, 1));
  }
}
