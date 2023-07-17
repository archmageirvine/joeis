package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a285.A285037;

/**
 * A056514 Number of primitive (period n) periodic palindromic structures using a maximum of three different symbols.
 * @author Sean A. Irvine
 */
public class A056514 extends A285037 {

  /** Construct the sequence. */
  public A056514() {
    super(0);
  }

  private int mN = -1;

  @Override
  public Z next() {
    return get(++mN, 3).add(get(mN, 2)).add(get(mN, 1));
  }
}
