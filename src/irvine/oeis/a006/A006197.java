package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a000.A000984;

/**
 * A006197 Least number not dividing binomial(2n,n).
 * @author Sean A. Irvine
 */
public class A006197 extends A000984 {

  /** Construct the sequence. */
  public A006197() {
    super(1);
  }

  {
    super.next();
  }

  @Override
  public Z next() {
    final Z a = super.next();
    long k = 1;
    while (a.mod(++k) == 0) {
      // do nothing
    }
    return Z.valueOf(k);
  }
}
