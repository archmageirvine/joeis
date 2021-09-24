package irvine.oeis.a186;
// manually 2021-09-24

import irvine.oeis.RankSequence;
import irvine.oeis.a000.A000290;
import irvine.oeis.a000.A000578;

/**
 * A186146 Rank of n^3 when {i^2: i&gt;=1} and {j^3: j&gt;=1} are jointly ranked with i^2 before j^3 when i^2=j^3.  Complement of A186145.
 * @author Georg Fischer
 */
public class A186146 extends RankSequence {

  /** Construct the sequence. */
  public A186146() {
    super(new A000290(), new A000578(), 0, 2);
  }
}
