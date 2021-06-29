package irvine.oeis.a145;
// manually (diffseq) at 2021-06-28

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a002.A002071;

/**
 * A145604 Number of pairs of consecutive integers x, x+1 such that both are prime(n)-smooth but both are not prime(n-1)-smooth.
 * @author Georg Fischer
 */
public class A145604 extends PrependSequence {

  /** Construct the sequence. */
  public A145604() {
    super(new DifferenceSequence(new A002071()), 1);
  }
}
