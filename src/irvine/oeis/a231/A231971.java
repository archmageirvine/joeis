package irvine.oeis.a231;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A231971 Number of (n+1) X (2+1) 0..1 arrays with no element having a strict majority of its horizontal and vertical neighbors equal to one.
 * @author Georg Fischer
 */
public class A231971 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A231971() {
    super(1, "[0,16,8,1,11,-62,-14,1,-5,6]", "[1,-3,0,-2,-4,10,2,0,1,-1]");
  }
}
