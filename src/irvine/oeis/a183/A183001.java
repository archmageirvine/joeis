package irvine.oeis.a183;
// Generated by gen_seq4.pl zbasex at 2021-07-20 16:28

import irvine.math.z.Z;
import irvine.oeis.cons.ZBaseExpansionSequence;


/**
 * A183001 Decimal expansion of the integer c^4 where c = 299792458 (exactly) is the speed of light in vacuum (m/s).
 * @author Georg Fischer
 */
public class A183001 extends ZBaseExpansionSequence {

  /** Construct the sequence. */
  public A183001() {
    super(34, Z.valueOf(299792458L).pow(4));
  }
}
