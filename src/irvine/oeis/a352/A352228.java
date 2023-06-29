package irvine.oeis.a352;
// manually deris/essent at 2023-03-24 13:24

import irvine.oeis.PrependSequence;
import irvine.oeis.a060.A060973;

/**
 * A352228 Number of length-n blocks in the Thue-Morse sequence with intertwining pattern ABBA ABBA ABBA... .
 * @author Georg Fischer
 */
public class A352228 extends PrependSequence {

  /** Construct the sequence. */
  public A352228() {
    super(1, new A060973().skip(0), 0);
  }
}
