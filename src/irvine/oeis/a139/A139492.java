package irvine.oeis.a139;
// Generated by gen_seq4.pl pricongrm/pricongr at 2023-08-13 09:20

import irvine.math.z.Z;
import irvine.oeis.prime.CongruenceForm;

/**
 * A139492 Primes of the form x^2 + 5x*y + y^2 for x and y nonnegative.
 * @author Georg Fischer
 */
public class A139492 extends CongruenceForm {

  private long mN = 1;

  /** Construct the sequence. */
  public A139492() {
    super(21, 0, 1, 4, 7, 16);
  }

  @Override
  public Z next() {
    return (++mN == 1) ? Z.SEVEN : super.next();
  }
}
