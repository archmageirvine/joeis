package irvine.oeis.a095;
// Generated by gen_seq4.pl knest/jaguarz at 2023-03-01 20:54

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002275;

/**
 * A095370 Number of distinct prime factors of the repunit (-1 + 10^n)/9.
 * @author Georg Fischer
 */
public class A095370 extends A002275 {

  /** Construct the sequence. */
  public A095370() {
    super(1);
  }

  {
    super.next();
  }

  @Override
  public Z next() {
    return Z.valueOf(Functions.OMEGA.i(super.next()));
  }
}
