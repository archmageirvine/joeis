package irvine.oeis.a250;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A250789 Number of (7+1) X (n+1) 0..1 arrays with nondecreasing x(i,j)+x(i,j-1) in the i direction and nondecreasing absolute value of x(i,j)-x(i-1,j) in the j direction.
 * @author Georg Fischer
 */
public class A250789 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A250789() {
    super(1, "[0,576,-3012,5686,-2386,-6648,10018,-3732,-2174,2188,-512]", "[1,-8,25,-35,9,37,-47,15,10,-9,2]");
  }
}
