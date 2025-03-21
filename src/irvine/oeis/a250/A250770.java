package irvine.oeis.a250;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A250770 Number of (2+1) X (n+1) 0..1 arrays with nondecreasing x(i,j)-x(i,j-1) in the i direction and nondecreasing absolute value of x(i,j)-x(i-1,j) in the j direction.
 * @author Georg Fischer
 */
public class A250770 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A250770() {
    super(1, "[0,18,-38,16]", "[1,-4,5,-2]");
  }
}
