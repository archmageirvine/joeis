package irvine.oeis.a033;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a023.A023109;

/**
 * A033866 Least number of <code>Reverse-then-add</code> persistence <code>n</code>.
 * @author Sean A. Irvine
 */
public class A033866 extends PrependSequence {

  /** Construct the sequence. */
  public A033866() {
    super(new SkipSequence(new A023109(), 1), 1);
  }
}
