package irvine.oeis.a326;
// manually deris/essent at 2022-04-28 15:40

import irvine.oeis.PrependSequence;
import irvine.oeis.a073.A073717;

/**
 * A326329 future sequence
 * @author Georg Fischer
 */
public class A326329 extends PrependSequence {

  /** Construct the sequence. */
  public A326329() {
    super(new A073717(), 1);
  }
}
