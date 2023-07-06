package irvine.oeis.a046;

import irvine.oeis.PartialProductSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000720;

/**
 * A046993 Partial products of pi(n), A000720.
 * @author Sean A. Irvine
 */
public class A046993 extends PartialProductSequence {

  /** Construct the sequence. */
  public A046993() {
    super(2, new PrependSequence(new A000720().skip(1), 1));
  }
}
