package irvine.oeis.a113;
// manually partsum2 at 2022-12-26 16:19

import irvine.oeis.PartialSumSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a066.A066660;

/**
 * A113241 Sum{k=1..n, tau(2k)-1}.
 * @author Georg Fischer
 */
public class A113241 extends PartialSumSequence {

  /** Construct the sequence. */
  public A113241() {
    super(0, new PrependSequence(0, new A066660(), 0));
  }
}
