package irvine.oeis.a033;

import irvine.oeis.PrependSequence;
import irvine.oeis.a023.A023109;

/**
 * A033866 Least number of Reverse-then-add persistence n.
 * @author Sean A. Irvine
 */
public class A033866 extends PrependSequence {

  /** Construct the sequence. */
  public A033866() {
    super(new A023109().skip(1), 1);
  }
}
