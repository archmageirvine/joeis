package irvine.oeis.a394;

import irvine.oeis.Combiner;
import irvine.oeis.a000.A000798;
import irvine.oeis.a006.A006905;

/**
 * A394405 allocated for Firdous Ahmad Mala.
 * @author Sean A. Irvine
 */
public class A394405 extends Combiner {

  /** Construct the sequence. */
  public A394405() {
    super(0, new A006905(), new A000798(), SUBTRACT);
  }
}

