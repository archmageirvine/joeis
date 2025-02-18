package irvine.oeis.a075;

import irvine.oeis.AlternatingSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a005.A005117;
import irvine.oeis.a013.A013929;

/**
 * A075378 Rearrangement of natural numbers with a(1) = 1, a(2n) squarefree and a(2n+1) not squarefree.
 * @author Sean A. Irvine
 */
public class A075378 extends PrependSequence {

  /** Construct the sequence. */
  public A075378() {
    super(1, new AlternatingSequence(new A005117().skip(), new A013929()), 1);
  }
}
