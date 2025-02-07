package irvine.oeis.a075;

import irvine.oeis.Conjectural;
import irvine.oeis.FiniteSequence;
import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.UnionSequence;
import irvine.oeis.a058.A058295;

/**
 * A075078.
 * @author Sean A. Irvine
 */
public class A075082 extends SetDifferenceSequence implements Conjectural {

  /** Construct the sequence. */
  public A075082() {
    super(1, new UnionSequence(new A058295(), new FiniteSequence(10, 16)), new FiniteSequence(2));
  }
}

