package irvine.oeis.a106;

import irvine.oeis.a130.A130020;
import irvine.oeis.triangle.Transpose;

/**
 * A106566 Triangle T(n,k), 0 &lt;= k &lt;= n, read by rows, given by [0, 1, 1, 1, 1, 1, 1, 1, ... ] DELTA [1, 0, 0, 0, 0, 0, 0, 0, ... ] where DELTA is the operator defined in A084938.
 * where DELTA is the operator defined in A084938.
 * @author Georg Fischer
 */
public class A106566 extends Transpose {

  /** Construct the sequence. */
  public A106566() {
    super(0, new A130020());
  }
}
