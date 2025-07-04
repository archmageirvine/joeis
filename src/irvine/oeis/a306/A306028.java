package irvine.oeis.a306;
// Generated by gen_seq4.pl 2025-06-22.ack/polyx at 2025-06-22 22:11

import irvine.oeis.PolynomialFieldSequence;

/**
 * A306028 Number of length-n restricted growth strings (RGS) with growth &lt;= four and first element in [4].
 * @author Georg Fischer
 */
public class A306028 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A306028() {
    super(0, "[1],[0,1],[0,2],[0,3],[0,4]", "p1,exp,1,-,p2,exp,1,-,2,/,+,p3,exp,1,-,3,/,+,p4,exp,1,-,4,/,+,exp", 0, 1);
  }
}
