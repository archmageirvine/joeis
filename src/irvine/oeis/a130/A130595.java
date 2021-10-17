package irvine.oeis.a130;
// manually triangle at 2021-10-14

import irvine.oeis.a007.A007318;
import irvine.oeis.triangle.Inverse;

/**
 * A130595 Triangle read by rows: lower triangular matrix which is inverse to Pascal's triangle (A007318) regarded as a lower triangular matrix.
 * @author Georg Fischer
 */
public class A130595 extends Inverse {

  /** Construct the sequence. */
  public A130595() {
    super(new A007318());
  }
}
