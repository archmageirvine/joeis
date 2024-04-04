package irvine.oeis.a069;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002808;

/**
 * A069098.
 * @author Sean A. Irvine
 */
public class A069116 extends FilterSequence {

  /** Construct the sequence. */
  public A069116() {
    super(1, new A002808(), k -> Jaguar.factor(k).core().square().compareTo(k) > 0);
  }
}

