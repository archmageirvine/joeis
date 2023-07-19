package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a285.A285012;

/**
 * A056504 Number of periodic palindromic structures of length n using a maximum of three different symbols.
 * @author Sean A. Irvine
 */
public class A056504 extends A285012 {

  /** Construct the sequence. */
  public A056504() {
    super(0);
  }

  private int mN = -1;

  @Override
  public Z next() {
    return t(++mN, 3).add(t(mN, 2)).add(t(mN, 1));
  }
}
