package irvine.oeis.a160;
// manually deris/essent at 2022-04-28 12:39

import irvine.oeis.a008.A008956;
import irvine.oeis.triangle.Transpose;

/**
 * A160563 Table of the number of (n,k)-Riordan complexes, read by rows.
 * @author Georg Fischer
 */
public class A160563 extends Transpose {

  /** Construct the sequence. */
  public A160563() {
    super(new A008956());
  }
}
