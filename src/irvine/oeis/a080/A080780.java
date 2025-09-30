package irvine.oeis.a080;

import irvine.oeis.a079.A079000;

/**
 * A080707.
 * @author Sean A. Irvine
 */
public class A080780 extends A079000 {

  /** Construct the sequence. */
  public A080780() {
    super(1, 2, 0, n -> n.mod(6) == 0);
  }
}
