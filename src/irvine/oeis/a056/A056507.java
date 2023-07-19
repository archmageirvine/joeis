package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a285.A285012;

/**
 * A056507 Number of periodic palindromic structures using a maximum of six different symbols.
 * @author Sean A. Irvine
 */
public class A056507 extends A285012 {

  /** Construct the sequence. */
  public A056507() {
    super(0);
  }

  private int mN = -1;

  @Override
  public Z next() {
    return t(++mN, 6).add(t(mN, 5)).add(t(mN, 4)).add(t(mN, 3)).add(t(mN, 2)).add(t(mN, 1));
  }
}
