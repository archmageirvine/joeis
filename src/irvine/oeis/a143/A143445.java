package irvine.oeis.a143;
// Generated by gen_seq4.pl trixint0/parmof2 at 2023-06-27 10:07

import irvine.oeis.a001.A001318;
import irvine.oeis.a130.A130162;

/**
 * A143445 Triangle read by rows, A051731 * (A001318 * 0^(n-k)); 1&lt;=k&lt;=n.
 * @author Georg Fischer
 */
public class A143445 extends A130162 {

  /** Construct the sequence. */
  public A143445() {
    super(1, new A001318().skip(1));
  }
}
