package irvine.oeis.a115;
// Generated by gen_seq4.pl 2023-11-25/filter at 2023-11-26 00:04

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000290;

/**
 * A115690 Squares whose digit reversal is a powerful(1) number (A001694).
 * @author Georg Fischer
 */
public class A115690 extends FilterSequence {

  /** Construct the sequence. */
  public A115690() {
    super(1, new A000290(), v -> {
      final Z w = Functions.REVERSE.z(v);
      return w.equals(Z.ONE) || Jaguar.factor(w).minExponent() > 1;
    });
  }
}
