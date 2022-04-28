package irvine.oeis.a322;
// manually deris/partsum at 2022-04-28 15:40

import irvine.oeis.PartialSumSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a069.A069359;

/**
 * A322068 future sequence
 * @author Georg Fischer
 */
public class A322068 extends PartialSumSequence {

  /** Construct the sequence. */
  public A322068() {
    super(new PrependSequence(new A069359(), 0));
  }
}
