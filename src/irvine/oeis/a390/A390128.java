package irvine.oeis.a390;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FilterSequence;
import irvine.oeis.a391.A391319;

/**
 * A392509.
 * @author Sean A. Irvine
 */
public class A390128 extends FilterSequence {

  /** Construct the sequence. */
  public A390128() {
    super(1, new A391319(), k -> Jaguar.factor(k).maxExponent() < 4);
  }
}
