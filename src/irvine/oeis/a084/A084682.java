package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a125.A125592;

/**
 * A084682 Even evil numbers with an even digital sum.
 * @author Sean A. Irvine
 */
public class A084682 extends FilterSequence {

  /** Construct the sequence. */
  public A084682() {
    super(new A125592(), k -> (Functions.DIGIT_SUM.l(k) & 1) == 0);
  }
}
