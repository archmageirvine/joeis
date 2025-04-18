package irvine.oeis.a250;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A250727 Number of (n+1) X (6+1) 0..1 arrays with nondecreasing x(i,j)+x(i,j-1) in the i direction and nondecreasing min(x(i,j),x(i-1,j)) in the j direction.
 * @author Georg Fischer
 */
public class A250727 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A250727() {
    super(1, "[0,579,-2677,4647,-2696,-2151,4417,-2892,866,-72,-19,9,-15,10,-2]", "[1,-7,20,-28,14,14,-28,20,-7,1]");
  }
}
