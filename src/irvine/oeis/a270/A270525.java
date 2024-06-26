package irvine.oeis.a270;
// Generated by gen_seq4.pl regypt/parmof3 at 2024-01-20 11:51

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.oeis.a269.A269993;

/**
 * A270525 Denominators of r-Egyptian fraction expansion for log(2), where r(k) = 1/k!.
 * @author Georg Fischer
 */
public class A270525 extends A269993 {

  /** Construct the sequence. */
  public A270525() {
    super(1, CR.TWO.log(), k -> Functions.FACTORIAL.z(k));
  }
}
