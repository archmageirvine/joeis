package irvine.oeis.a348;
// Generated by gen_seq4.pl linrec/linrec2 at 2022-04-29 22:30
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.recur.LinearRecurrence;

/**
 * A348290 a(n) = Sum_{k=0..floor(n/10)} binomial(n-5*k,5*k).
 * @author Georg Fischer
 */
public class A348290 extends LinearRecurrence {

  /** Construct the sequence. */
  public A348290() {
    super(new Z[] {Z.ONE, Z.ZERO, Z.ZERO, Z.ZERO, Z.ZERO, Z.ONE, new Z("-5"), Z.TEN, new Z("-10"), Z.FIVE}, new Z[] {Z.ONE, Z.ONE, Z.ONE, Z.ONE, Z.ONE, Z.ONE, Z.ONE, Z.ONE, Z.ONE, Z.ONE});
  }
}
