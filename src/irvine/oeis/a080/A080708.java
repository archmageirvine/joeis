package irvine.oeis.a080;

import irvine.oeis.a079.A079000;

/**
 * A080633
 * @author Sean A. Irvine
 */
public class A080708 extends A079000 {

  /** Construct the sequence. */
  public A080708() {
    super(1, 5, 0, n -> n.mod(4) == 0);
  }
}
