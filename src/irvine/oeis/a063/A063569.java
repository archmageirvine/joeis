package irvine.oeis.a063;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a062.A062523;

/**
 * A063569 6^a(n) is smallest positive power of 6 containing the string 'n'.
 * @author Sean A. Irvine
 */
public class A063569 extends PrependSequence {

  /** Construct the sequence. */
  public A063569() {
    super(new SkipSequence(new A062523(), 2), 9, 3);
  }
}
