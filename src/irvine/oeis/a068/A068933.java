package irvine.oeis.a068;

import irvine.oeis.Combiner;
import irvine.oeis.a051.A051031;

/**
 * A068933 Triangular array D(n, r) = number of disconnected r-regular graphs with n nodes, 0 &lt;= r &lt; n.
 * @author Sean A. Irvine
 */
public class A068933 extends Combiner {

  /** Construct the sequence. */
  public A068933() {
    super(1, new A051031(), new A068934(), SUBTRACT);
  }
}

