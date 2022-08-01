package irvine.oeis.a299;

import irvine.math.z.Z;
import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A299919 Motzkin numbers (A001006) mod 4.
 * Recurrence (3+3*n)*a(n)+(5+2*n)*a(1+n)+(-4-n)*a(n+2).
 * @author Georg Fischer
 */
public class A299919 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A299919() {
    super(0, "[[0],[3, 3],[5, 2],[-4,-1]", "1", 2);
  }

  @Override
  public Z next() {
    return super.next().mod(Z.FOUR);
  }
}
