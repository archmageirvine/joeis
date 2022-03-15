package irvine.oeis.a055;

import irvine.oeis.a034.A034851;
import irvine.oeis.triangle.Inverse;

/**
 * A055138 Matrix inverse of Losanitsch's triangle A034851.
 * @author Georg Fischer
 */
public class A055138 extends Inverse {

  /** Construct the sequence. */
  public A055138() {
    super(new A034851());
  }
}
