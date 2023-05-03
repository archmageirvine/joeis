package irvine.oeis.a063;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a062.A062524;

/**
 * A063570 Smallest positive power of 7 having n in its decimal representation.
 * @author Sean A. Irvine
 */
public class A063570 extends PrependSequence {

  /** Construct the sequence. */
  public A063570() {
    super(new SkipSequence(new A062524(), 2), 4, 4);
  }
}
