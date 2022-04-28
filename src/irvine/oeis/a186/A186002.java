package irvine.oeis.a186;
// manually deris/essent at 2022-04-28 12:39

import irvine.oeis.PrependSequence;
import irvine.oeis.a108.A108400;

/**
 * A186002 Hankel transform of A186001.
 * @author Georg Fischer
 */
public class A186002 extends PrependSequence {

  /** Construct the sequence. */
  public A186002() {
    super(new A108400(), 1);
  }
}
