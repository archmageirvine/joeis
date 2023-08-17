package irvine.oeis.a129;
// manually robots/union2 at 2023-08-15 15:43

import irvine.oeis.UnionSequence;
import irvine.oeis.a018.A018900;
import irvine.oeis.a023.A023758;

/**
 * A129523 Numbers of the form 2^j +- 2^i for 0 &lt;= i &lt; j, in ascending order.
 * @author Georg Fischer
 */
public class A129523 extends UnionSequence {

  /** Construct the sequence. */
  public A129523() {
    super(1, new A018900(), new A023758().skip(1));
  }
}
