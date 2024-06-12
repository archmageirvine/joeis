package irvine.oeis.a070;

import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002379;

/**
 * A070655.
 * @author Sean A. Irvine
 */
public class A070758 extends FilterSequence {

  /** Construct the sequence. */
  public A070758() {
    super(1, new A002379().skip(2), k -> !k.isProbablePrime());
  }
}
