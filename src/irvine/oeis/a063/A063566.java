package irvine.oeis.a063;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a062.A062520;

/**
 * A063566 3^a(n) = smallest positive power of 3 having n in its decimal representation.
 * @author Sean A. Irvine
 */
public class A063566 extends PrependSequence {

  /** Construct the sequence. */
  public A063566() {
    super(new SkipSequence(new A062520(), 2), 10, 4);
  }
}
