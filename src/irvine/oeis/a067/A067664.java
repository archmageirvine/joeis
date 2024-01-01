package irvine.oeis.a067;

import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002384;

/**
 * A067633.
 * @author Sean A. Irvine
 */
public class A067664 extends FilterSequence {

  /** Construct the sequence. */
  public A067664() {
    super(1, new A002384(), k -> k.square().add(1).isProbablePrime());
  }
}
