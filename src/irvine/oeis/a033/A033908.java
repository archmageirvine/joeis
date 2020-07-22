package irvine.oeis.a033;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;

/**
 * A033908 Least number of <code>Sort-then-add</code> persistence <code>n</code>.
 * @author Sean A. Irvine
 */
public class A033908 extends PrependSequence {

  /** Construct the sequence. */
  public A033908() {
    super(new SkipSequence(new A033863(), 1), 0);
  }
}
