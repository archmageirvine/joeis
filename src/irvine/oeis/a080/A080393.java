package irvine.oeis.a080;

import irvine.oeis.InverseSequence;

/**
 * A080393 a(n) is the smallest integer such that A080383(a(n)) = n.
 * @author Sean A. Irvine
 */
public class A080393 extends InverseSequence {

  /** Construct the sequence. */
  public A080393() {
    super(1, new A080383());
  }
}
