package irvine.oeis.a292;
// Generated by gen_seq4.pl doubled

import irvine.oeis.DoubledSequence;
import irvine.oeis.a006.A006068;

/**
 * A292600 a(n) = A006068(floor(n/2)); A006068 with every term duplicated, where A006068 is the inverse of binary gray code.
 * @author Georg Fischer
 */
public class A292600 extends DoubledSequence {

  /** Construct the sequence. */
  public A292600() {
    super(0, new A006068());
  }
}
