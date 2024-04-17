package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002275;

/**
 * A046053 Total number of prime factors of the repunit R(n)=(10^n-1)/9.
 * @author Sean A. Irvine
 */
public class A046053 extends A002275 {

  /** Construct the sequence. */
  public A046053() {
    super(1);
    super.next();
  }

  @Override
  public Z next() {
    return Functions.BIG_OMEGA.z(super.next());
  }
}
