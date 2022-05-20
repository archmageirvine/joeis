package irvine.oeis.a140;

import irvine.oeis.a132.A132371;
import irvine.oeis.triangle.WrappedRecurrence;

/**
 * A140709 Triangle read by rows: T(n,k) is the number of deco polyominoes of height n in which the maximal number of initial consecutive columns ending at the same level is k (1 &lt;= k &lt;= n).
 * @author Georg Fischer
 */
public class A140709 extends WrappedRecurrence {

  /** Construct the sequence. */
  public A140709() {
    super(new A132371(), "1");
  }
}
