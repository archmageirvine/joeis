package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a285.A285037;

/**
 * A056517 Number of primitive (period n) periodic palindromic structures using a maximum of six different symbols.
 * @author Sean A. Irvine
 */
public class A056517 extends A285037 {

  /** Construct the sequence. */
  public A056517() {
    super(0);
  }

  private int mN = -1;

  @Override
  public Z next() {
    return get(++mN, 6).add(get(mN, 5)).add(get(mN, 4)).add(get(mN, 3)).add(get(mN, 2)).add(get(mN, 1));
  }
}
