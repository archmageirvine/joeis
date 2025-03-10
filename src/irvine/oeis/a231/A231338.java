package irvine.oeis.a231;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A231338 Number of (n+1) X (2+1) 0..3 arrays with no element unequal to a strict majority of its horizontal and vertical neighbors, with values 0..3 introduced in row major order.
 * @author Georg Fischer
 */
public class A231338 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A231338() {
    super(1, "[0,4,-11,1,-5,10,2,3]", "[1,-5,6,-2,8,-6,1,-3]");
  }
}
