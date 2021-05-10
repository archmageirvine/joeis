package irvine.oeis.a046;

import irvine.oeis.PartialProductSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000720;

/**
 * A046993 Partial products of pi(n), A000720.
 * @author Sean A. Irvine
 */
public class A046993 extends PartialProductSequence {

  /** Construct the sequence. */
  public A046993() {
    super(new PrependSequence(new SkipSequence(new A000720(), 1), 1));
  }
}
