package irvine.oeis.a394;

import irvine.math.z.InverseEuler;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002202;

/**
 * A394635 allocated for Jud McCranie.
 * @author Sean A. Irvine
 */
public class A394635 extends FilterSequence {

  /** Construct the sequence. */
  public A394635() {
    super(1, new A002202().skip(2), k -> InverseEuler.inversePhi(k.add(2)).isEmpty() && InverseEuler.inversePhi(k.subtract(2)).isEmpty());
  }
}

