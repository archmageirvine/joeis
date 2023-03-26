package irvine.oeis.a156;
// manually deris/essent at 2023-03-24 13:24

import irvine.oeis.PrependSequence;
import irvine.oeis.a061.A061419;

/**
 * A156623 Values of register b when register a becomes 0 for the two register machine {i[1], i[1], i[1], d[2,1], d[1,6], i[2], d[1,5], d[2,3]}
 * @author Georg Fischer
 */
public class A156623 extends PrependSequence {

  /** Construct the sequence. */
  public A156623() {
    super(0, new A061419());
  }
}
