package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000225;

/**
 * A046801 Number of divisors of 2^n-1.
 * @author Sean A. Irvine
 */
public class A046801 extends A000225 {

  /** Construct the sequence. */
  public A046801() {
    super(1);
  }

  {
    super.next();
  }

  @Override
  public Z next() {
    final Z a = super.next();
    return a.compareTo(Z.TWO) < 0 ? Z.ONE : Jaguar.factor(a).sigma0();
  }
}

